package com.example.projeto_perfomance_kotlin.database.daos

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.example.projeto_perfomance_kotlin.models.IPGeolocation

interface IpGeolocationDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(ipGeolocation: IPGeolocation)
}