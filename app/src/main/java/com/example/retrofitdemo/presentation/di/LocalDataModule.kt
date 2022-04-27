package com.example.retrofitdemo.presentation.di

import com.example.retrofitdemo.data.db.MovieDao
import com.example.retrofitdemo.data.repository.LocalDbDataSource
import com.example.retrofitdemo.data.repository.LocalDbDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao) : LocalDbDataSource {
        return LocalDbDataSourceImpl(movieDao)
    }
}