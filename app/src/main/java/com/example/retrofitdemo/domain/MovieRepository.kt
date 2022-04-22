package com.example.retrofitdemo.domain

import com.example.retrofitdemo.data.model.Movie

interface MovieRepository {

    suspend fun getMovies(): List<Movie>

    suspend fun updateMovies(): List<Movie>
}