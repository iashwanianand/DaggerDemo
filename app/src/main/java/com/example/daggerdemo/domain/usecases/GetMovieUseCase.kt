package com.example.daggerdemo.domain.usecases

import com.example.daggerdemo.data.model.Movie
import com.example.daggerdemo.domain.MovieRepository

class GetMovieUseCase(private val movieRepository: MovieRepository) {

    suspend fun execute(): List<Movie> {
        return movieRepository.getMovies()
    }
}