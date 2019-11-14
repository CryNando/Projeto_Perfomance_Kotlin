package com.example.projeto_perfomance_kotlin.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.projeto_perfomance_kotlin.models.NewsApi
import com.example.projeto_perfomance_kotlin.repositories.NewsApiRepository

class NewsApiViewModel(application: Application) : AndroidViewModel(application) {

    private val newsApiRepository = NewsApiRepository(application)

    fun getNews() {
        return newsApiRepository.getNews()
    }

    fun insert(news: NewsApi) {
        newsApiRepository.insertNews(news = news)
    }
}