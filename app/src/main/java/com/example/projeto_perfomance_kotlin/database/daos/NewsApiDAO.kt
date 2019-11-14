package com.example.projeto_perfomance_kotlin.database.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.example.projeto_perfomance_kotlin.models.NewsApi

@Dao
interface NewsApiDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(newsApi: NewsApi)
}