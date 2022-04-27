package com.example.daggerdemo.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.daggerdemo.domain.usecases.GetMovieUseCase
import com.example.daggerdemo.domain.usecases.UpdateMovieUseCase

class MovieViewModelFactory(
    private val getMovieUseCase: GetMovieUseCase,
    private val updateMovieUseCase: UpdateMovieUseCase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MovieViewModel::class.java)) {
            return MovieViewModel(getMovieUseCase, updateMovieUseCase) as T
        }
        throw IllegalArgumentException("ViewModel not found")
    }
}