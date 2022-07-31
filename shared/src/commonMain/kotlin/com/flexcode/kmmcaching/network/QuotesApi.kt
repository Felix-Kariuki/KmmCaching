package com.flexcode.kmmcaching.network

import com.flexcode.kmmcaching.entity.Characters
import com.flexcode.kmmcaching.entity.Quotes
import com.flexcode.kmmcaching.entity.Results
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

class QuotesApi {
    private val httpClient = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                prettyPrint = true
                isLenient = true
                ignoreUnknownKeys = true
                useAlternativeNames=false
            })
        }
    }


    suspend fun getAllCharacters(): List<Quotes>{
        val response = httpClient.get(BASE_URL+ CHARACTERS_ENDPOINT)
        println(response.body<Any?>().toString())
        return response.body()
    }

    companion object{
        private const val BASE_URL = "https://programming-quotes-api.herokuapp.com/"
        private const val CHARACTERS_ENDPOINT ="quotes"
    }
}