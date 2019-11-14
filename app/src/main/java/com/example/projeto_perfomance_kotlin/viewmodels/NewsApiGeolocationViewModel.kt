package com.example.projeto_perfomance_kotlin.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.projeto_perfomance_kotlin.repositories.NewsApiRepository

class NewsApiGeolocationViewModel(application: Application) : AndroidViewModel(application) {

    private val newsApiRepository = NewsApiRepository()

    fun getNews() {
        return newsApiRepository.getNews()
    }

}