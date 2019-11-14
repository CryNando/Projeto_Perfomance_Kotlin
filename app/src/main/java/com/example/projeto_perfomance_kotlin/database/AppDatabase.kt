/**
 * Copyright (C) 2018 Motorola Mobility, Inc.
 * All Rights Reserved.
 * Motorola Mobility Confidential Restricted.
 */

package com.example.projeto_perfomance_kotlin.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.projeto_perfomance_kotlin.database.daos.IpGeolocationDAO
import com.example.projeto_perfomance_kotlin.database.daos.NewsApiDAO
import com.example.projeto_perfomance_kotlin.models.IPGeolocation
import com.example.projeto_perfomance_kotlin.models.NewsApi

@Database(entities = [IPGeolocation::class, NewsApi::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun ipGeolocationDAO(): IpGeolocationDAO
    abstract fun newsApiDAO(): NewsApiDAO

    companion object {
        private var instance: AppDatabase? = null

        @JvmStatic
        fun getInstance(context: Context): AppDatabase {
            if (instance == null) {
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "database"
                )
                    .build()
            }
            return instance!!
        }

    }
}