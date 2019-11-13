package com.example.projeto_perfomance_kotlin.apis

import com.example.projeto_perfomance_kotlin.models.NewsApi
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPIInterface {

    @GET("v2/org/v2/everything")
    fun getNews(
        @Query("q") q: String,
        @Query("from") from: String,
        @Query("sortBy") sortBy: String,
        @Query("apiKey") apiKey: String
    ): Call<List<NewsApi>>
}