package com.example.projeto_perfomance_kotlin.apis

import com.example.projeto_perfomance_kotlin.models.IPGeolocation
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface IpGeolocationApiInterface {
    @GET("ip-location/{ip}")
    fun getGeolocation(@Path("ip") ip: String): Call<List<IPGeolocation>>
}