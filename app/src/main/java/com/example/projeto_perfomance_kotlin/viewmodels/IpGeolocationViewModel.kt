package com.example.projeto_perfomance_kotlin.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.projeto_perfomance_kotlin.repositories.IPGeolocationRepository

class IpGeolocationViewModel(application: Application) : AndroidViewModel(application) {

    private val ipGeolocationRepository = IPGeolocationRepository()

    fun getGeolocation() {
        return ipGeolocationRepository.getNews()
    }
}