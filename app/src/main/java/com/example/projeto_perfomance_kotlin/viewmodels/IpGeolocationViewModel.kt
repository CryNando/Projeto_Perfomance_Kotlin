package com.example.projeto_perfomance_kotlin.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.projeto_perfomance_kotlin.models.IPGeolocation
import com.example.projeto_perfomance_kotlin.repositories.IPGeolocationRepository
import kotlinx.coroutines.*

class IpGeolocationViewModel(application: Application) : AndroidViewModel(application) {

    private val ipGeolocationRepository = IPGeolocationRepository(application)

    fun getGeolocation() {
        GlobalScope.launch {
            val result = ipGeolocationRepository.getGeolocation()
        }
    }


    fun insert(ipGeolocation: IPGeolocation) {
        ipGeolocationRepository.insert(ipGeolocation = ipGeolocation)
    }
}