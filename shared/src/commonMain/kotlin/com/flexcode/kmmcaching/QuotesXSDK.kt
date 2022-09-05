package com.flexcode.kmmcaching

import com.flexcode.kmmcaching.cache.Database
import com.flexcode.kmmcaching.cache.DatabaseDriverFactory
import com.flexcode.kmmcaching.entity.Quotes
import com.flexcode.kmmcaching.network.QuotesApi

class QuotesXSDK(databaseDriverFactory: DatabaseDriverFactory) {

    private val db = Database(databaseDriverFactory)
    private val api = QuotesApi()

    @Throws(Exception::class) suspend fun getCharacters(fetchFromRemote:Boolean):List<Quotes>{
        val cachedQuotes = db.getAllQuotes()
        return if (cachedQuotes.isNotEmpty() && !fetchFromRemote){
            cachedQuotes
        }else {
            api.getAllQuotes().also {
                db.clearDatabase()
                db.createQuotes(it)
            }
        }
    }
}