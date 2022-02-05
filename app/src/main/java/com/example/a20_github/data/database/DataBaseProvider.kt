package com.example.a20_github.data.database

import androidx.room.Room
import androidx.room.processor.Context

object DataBaseProvider {

    private const val DB_NAME = "github_repository_app.db"

    fun provideDB(applicationContext: Context) = Room.databaseBuilder(
        applicationContext,
        SimpleGithubDatabase::class.java, DB_NAME
    ).build()
}