package com.example.projeto_perfomance_kotlin.repositories

import com.example.projeto_perfomance_kotlin.apis.NewsAPIInterface
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NewsApiRepository() {
    companion object {
        const val BASE_URL = "https://newsapi.org/"
    }

    private val api = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(NewsAPIInterface::class.java)

    fun getNews() {
        val q = "bitcoin"
        val from = "2019-10-13"
        val sortBy = "publishedAt"
        val apiKey = "aa3547345b0849ad8deedd045bb18151"
        val call = api.getNews(q, from, sortBy, apiKey)
    }
}