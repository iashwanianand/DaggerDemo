package com.example.retrofitdemo.domain.usecases

import com.example.retrofitdemo.data.model.Movie
import com.example.retrofitdemo.domain.MovieRepository

class UpdateMovieUseCase(private val movieRepository: MovieRepository) {

    suspend fun updateMovies() : List<Movie> {
        return movieRepository.updateMovies()
    }
}