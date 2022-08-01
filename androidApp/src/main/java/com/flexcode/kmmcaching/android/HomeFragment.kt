package com.flexcode.kmmcaching.android

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.flexcode.kmmcaching.QuotesXSDK
import com.flexcode.kmmcaching.android.databinding.FragmentHomeBinding
import com.flexcode.kmmcaching.cache.DatabaseDriverFactory
import com.flexcode.kmmcaching.entity.Quotes
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private lateinit var quotesAdapter: QuotesAdapter

    private val mainScope = MainScope()
    lateinit var quotesList: ArrayList<Quotes>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        quotesAdapter = QuotesAdapter(QuotesAdapter.OnClickListener { quote ->
            //TODO:show full quote
        })

        quotesList = ArrayList()

        retrieveQuotes(false)

        binding.swipeContainer.setOnRefreshListener {
            binding.swipeContainer.isRefreshing = false
            retrieveQuotes(true)
        }

        binding.searchView.setEndIconOnClickListener{
            val searchItem = binding.etSearchQuote.text.toString().trim()
            val results = quotesList.filter { it.en.contains(searchItem) }
            quotesAdapter.submitList(results)
            binding.rvQuotes.adapter = quotesAdapter
        }

    }

    private fun retrieveQuotes(fetchFromRemote: Boolean) {
        val sdk = QuotesXSDK(DatabaseDriverFactory(requireContext()))

        mainScope.launch {
            kotlin.runCatching {
                sdk.getCharacters(fetchFromRemote)
            }.onSuccess {
                //TODO:stop loading progress
                quotesList.addAll(it)
                quotesAdapter.submitList(it)
                binding.rvQuotes.adapter = quotesAdapter
            }.onFailure {
                Toast.makeText(requireContext(), it.localizedMessage, Toast.LENGTH_LONG).show()
                Log.d("TAG",it.localizedMessage)
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
        mainScope.cancel()
    }
}