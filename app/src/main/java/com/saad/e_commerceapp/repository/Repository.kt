package com.saad.e_commerceapp.repository

import com.saad.e_commerceapp.api.QuoteService
import com.saad.e_commerceapp.realm.MongoRepo
import com.saad.e_commerceapp.realm.Quotes
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Repository @Inject constructor(
    val realmDB: MongoRepo,
    val quotesApi: QuoteService
) {
    lateinit var resultView: Quotes
    suspend fun getQuotesBackground() {
        val random = (Math.random() * 10).toInt()
        var result = quotesApi.getQuotes(random)
        try {
            if (result.isSuccessful) {
                val quoteResponse: Quotes = result.body()!!
                resultView = quoteResponse
                quoteResponse?.let {
                    realmDB.insertQuote(quoteResponse)
                }
            } else {

            }
        } catch (e: Exception) {

        }
    }
}