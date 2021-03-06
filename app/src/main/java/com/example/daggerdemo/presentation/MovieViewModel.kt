package com.example.daggerdemo.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.daggerdemo.data.model.Movie
import com.example.daggerdemo.domain.usecases.GetMovieUseCase
import com.example.daggerdemo.domain.usecases.UpdateMovieUseCase

class MovieViewModel(private val getMovieUseCase: GetMovieUseCase, private val updateMovieUseCase: UpdateMovieUseCase) : ViewModel() {

    fun getMovies() : LiveData<List<Movie>?> = liveData {
        val movieList : List<Movie>? = getMovieUseCase.execute()
        emit(movieList)
    }

    fun updateMovies() : LiveData<List<Movie>?> = liveData {
        val movieList : List<Movie>? = updateMovieUseCase.execute()
        emit(movieList)
    }
}