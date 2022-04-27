package com.example.daggerdemo.presentation.di

import com.example.daggerdemo.domain.usecases.GetMovieUseCase
import com.example.daggerdemo.domain.usecases.UpdateMovieUseCase
import com.example.daggerdemo.presentation.MovieViewModelFactory
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