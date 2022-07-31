package com.flexcode.kmmcaching.android

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.flexcode.kmmcaching.android.databinding.QuoteItemBinding
import com.flexcode.kmmcaching.entity.Quotes

class QuotesAdapter(
    private val onClickListener: OnClickListener
) : ListAdapter<Quotes,QuotesAdapter.MyViewHolder>(COMPARATOR){


    inner class MyViewHolder(private val binding: QuoteItemBinding):
    RecyclerView.ViewHolder(binding.root){
        fun bind(quotes: Quotes){
            binding.tvAuthor.text = quotes.author
            binding.tvQuote.text = quotes.en
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            QuoteItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val quote = getItem(position)
        holder.bind(quote)
        holder.itemView.setOnClickListener {
            onClickListener.onClick(quote)
        }
    }

    companion object {
        private val COMPARATOR = object : DiffUtil.ItemCallback<Quotes>() {
            override fun areItemsTheSame(oldItem: Quotes, newItem: Quotes): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: Quotes, newItem: Quotes): Boolean {
                return oldItem == newItem
            }

        }
    }

    class OnClickListener(val clickListener: (quotes: Quotes) -> Unit) {
        fun onClick(quotes: Quotes) = clickListener(quotes)
    }
}