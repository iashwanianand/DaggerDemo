package com.example.retrofitdemo.presentation.di

import com.example.retrofitdemo.data.repository.CacheMovieDataSource
import com.example.retrofitdemo.data.repository.CacheMovieDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {

    @Singleton
    @Provides
    fun provideCacheDataSource(): CacheMovieDataSource {
        return CacheMovieDataSourceImpl()
    }
}