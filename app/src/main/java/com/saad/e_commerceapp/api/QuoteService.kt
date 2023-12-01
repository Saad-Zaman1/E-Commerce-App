package com.saad.e_commerceapp.api

import com.saad.e_commerceapp.realm.Quotes
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header

interface QuoteService {
    @GET("/quotes")
    suspend fun getQuotes(@Header("page") page: Int): Response<Quotes>
}