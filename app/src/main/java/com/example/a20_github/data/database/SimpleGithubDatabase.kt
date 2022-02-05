package com.example.a20_github.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.a20_github.data.dao.SearchHistoryDao
import com.example.a20_github.data.entity.GithubRepoEntity


@Database(entities = [GithubRepoEntity::class], version = 1)
abstract class SimpleGithubDatabase: RoomDatabase() {

    abstract fun searchHistoryDao(): SearchHistoryDao

}