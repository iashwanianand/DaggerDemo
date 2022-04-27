package com.example.retrofitdemo.presentation.di

import com.example.retrofitdemo.domain.usecases.GetMovieUseCase
import com.example.retrofitdemo.domain.usecases.UpdateMovieUseCase
import com.example.retrofitdemo.presentation.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {

    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(getMovieUseCase: GetMovieUseCase, updateMovieUseCase: UpdateMovieUseCase) : MovieViewModelFactory {
        return MovieViewModelFactory(getMovieUseCase, updateMovieUseCase)
    }
}