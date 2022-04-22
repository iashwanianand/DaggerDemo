package com.example.retrofitdemo.domain.usecases

import com.example.retrofitdemo.data.model.Movie
import com.example.retrofitdemo.domain.MovieRepository

class GetMovieUseCase(private val movieRepository: MovieRepository) {

    suspend fun getMovie(): List<Movie> {
        return movieRepository.getMovies()
    }
}