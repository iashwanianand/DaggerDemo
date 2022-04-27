package com.example.retrofitdemo.presentation.di

import com.example.retrofitdemo.data.api.TmdbApi
import com.example.retrofitdemo.data.repository.RemoteMovieDataSource
import com.example.retrofitdemo.data.repository.RemoteMovieDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule(private val apiKey: String) {

    @Singleton
    @Provides
    fun provideRemoteDataSource(tmdbService: TmdbApi): RemoteMovieDataSource {
        return RemoteMovieDataSourceImpl(tmdbService, apiKey)

    }
}