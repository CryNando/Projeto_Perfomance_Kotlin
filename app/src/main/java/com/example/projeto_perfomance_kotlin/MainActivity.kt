package com.example.projeto_perfomance_kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.projeto_perfomance_kotlin.viewmodels.IpGeolocationViewModel
import com.example.projeto_perfomance_kotlin.viewmodels.NewsApiViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var ipGeolocationViewModel: IpGeolocationViewModel
    private lateinit var newsApiViewModel: NewsApiViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ipGeolocationViewModel = ViewModelProvider(this).get(IpGeolocationViewModel::class.java)
        newsApiViewModel = ViewModelProvider(this).get(NewsApiViewModel::class.java)

        button_ip_geolocation.setOnClickListener {
            ipGeolocationViewModel.getGeolocation()
        }

        button_news_api.setOnClickListener {
            newsApiViewModel.getNews()
        }

        button_save_ip_geolocation.setOnClickListener {

        }

        button_save_news_api.setOnClickListener {

        }

        button_calculate_matrix_operation.setOnClickListener {

        }
    }
}
