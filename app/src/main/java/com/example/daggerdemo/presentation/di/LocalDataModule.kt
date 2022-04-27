package com.example.daggerdemo.presentation.di

import com.example.daggerdemo.data.db.MovieDao
import com.example.daggerdemo.data.repository.LocalDbDataSource
import com.example.daggerdemo.data.repository.LocalDbDataSourceImpl
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