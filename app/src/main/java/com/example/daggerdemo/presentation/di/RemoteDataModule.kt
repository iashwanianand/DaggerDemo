package com.example.daggerdemo.presentation.di

import com.example.daggerdemo.data.api.TmdbApi
import com.example.daggerdemo.data.repository.RemoteMovieDataSource
import com.example.daggerdemo.data.repository.RemoteMovieDataSourceImpl
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