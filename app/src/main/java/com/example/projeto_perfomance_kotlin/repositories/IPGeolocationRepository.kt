package com.example.projeto_perfomance_kotlin.repositories

import android.app.Application
import com.example.projeto_perfomance_kotlin.apis.IpGeolocationApiInterface
import com.example.projeto_perfomance_kotlin.database.AppDatabase
import com.example.projeto_perfomance_kotlin.models.IPGeolocation
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class IPGeolocationRepository(application: Application) {
    companion object {
        const val BASE_URL = "https://ipgeolocation.io/"
    }

    private val ipGeolocationDAO = AppDatabase.getInstance(application).ipGeolocationDAO()

    private val api = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(IpGeolocationApiInterface::class.java)

    suspend fun getGeolocation(): List<IPGeolocation> {
        val ip = "200.148.226.100"
        return api.getGeolocation(ip)
    }

    fun insert(ipGeolocation: IPGeolocation) {
        ipGeolocationDAO.insert(ipGeolocation = ipGeolocation)
    }
}