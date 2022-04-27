package com.example.retrofitdemo.presentation.di

import com.example.retrofitdemo.domain.MovieRepository
import com.example.retrofitdemo.domain.usecases.GetMovieUseCase
import com.example.retrofitdemo.domain.usecases.UpdateMovieUseCase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UseCaseModule {

    @Singleton
    @Provides
    fun provideGetMovieUseCase(movieRepository: MovieRepository) : GetMovieUseCase {
        return GetMovieUseCase(movieRepository)
    }

    @Singleton
    @Provides
    fun provideUpdateMovieUseCase(movieRepository: MovieRepository) : UpdateMovieUseCase{
        return UpdateMovieUseCase(movieRepository)
    }
}