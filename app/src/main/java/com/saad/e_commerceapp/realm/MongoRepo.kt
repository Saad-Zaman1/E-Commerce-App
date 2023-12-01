package com.saad.e_commerceapp.realm

import kotlinx.coroutines.flow.Flow

interface MongoRepo {
    fun getQuotes(): Flow<List<Quotes>>
    suspend fun insertQuote(quotes: Quotes)
}