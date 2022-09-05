package com.flexcode.kmmcaching.cache

import com.flexcode.kmmcaching.entity.Quotes

internal class Database(databaseDriverFactory: DatabaseDriverFactory) {
    private val database = AppDatabase(databaseDriverFactory.createDriver())
    private val dbQuery = database.appDatabaseQueries

    internal fun clearDatabase() {
        dbQuery.transaction {
            dbQuery.deleteQuotes()
        }
    }

    internal fun getAllQuotes(): List<Quotes> {
        return dbQuery.getAllQuotes(::mapCharacters).executeAsList()
    }

    private fun mapCharacters(
        id:String,
        author :String,
        en:String
    ):Quotes{
        return Quotes(
            id = id,
            author = author,
            en = en
        )
    }

    internal fun createQuotes(quotes: List<Quotes>){
        dbQuery.transaction {
            quotes.forEach { quote->
                insertQuote(quote)
            }
        }
    }

    private fun insertQuote(results: Quotes) {
        dbQuery.insertQuote(
            id = results.id,
             author = results.author,
            en = results.en
        )
    }
}