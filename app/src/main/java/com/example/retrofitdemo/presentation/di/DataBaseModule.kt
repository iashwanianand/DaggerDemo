package com.example.retrofitdemo.presentation.di

import android.content.Context
import androidx.room.Room
import com.example.retrofitdemo.data.db.MovieDao
import com.example.retrofitdemo.data.db.MovieDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataBaseModule {

    @Singleton
    @Provides
    fun provideMovieDatabase(context: Context) : MovieDatabase {
        return Room.databaseBuilder(context, MovieDatabase::class.java, "tmdb_client").build()
    }

    @Singleton
    @Provides
    fun provideMovieDao(movieDatabase: MovieDatabase) : MovieDao {
        return movieDatabase.dao
    }
}