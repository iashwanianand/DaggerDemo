package com.example.daggerdemo.presentation.di

import com.example.daggerdemo.data.repository.CacheMovieDataSource
import com.example.daggerdemo.data.repository.CacheMovieDataSourceImpl
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