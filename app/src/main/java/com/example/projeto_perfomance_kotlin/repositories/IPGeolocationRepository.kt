package com.example.projeto_perfomance_kotlin.repositories

import com.example.projeto_perfomance_kotlin.apis.IpGeolocationApiInterface
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class IPGeolocationRepository {
    companion object {
        const val BASE_URL = "https://ipgeolocation.io/"
    }

    private val api = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(IpGeolocationApiInterface::class.java)

    fun getNews() {
        val ip = "200.148.226.100"
        val call = api.getGeolocation(ip)
    }
}