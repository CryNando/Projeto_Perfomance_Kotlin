package com.example.projeto_perfomance_kotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.projeto_perfomance_kotlin.viewmodels.IpGeolocationViewModel
import com.example.projeto_perfomance_kotlin.viewmodels.NewsApiViewModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var ipGeolocationViewModel: IpGeolocationViewModel
    private lateinit var newsApiViewModel: NewsApiViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ipGeolocationViewModel = ViewModelProvider(this).get(IpGeolocationViewModel::class.java)
        newsApiViewModel = ViewModelProvider(this).get(NewsApiViewModel::class.java)

        button_ip_geolocation.setOnClickListener {
            GlobalScope.launch(Dispatchers.Main) {
                val result = ipGeolocationViewModel.getGeolocation()
                Log.d("RESULT", result)
            }

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
