package com.example.daggerdemo.domain

import com.example.daggerdemo.data.model.Movie

interface MovieRepository {

    suspend fun getMovies(): List<Movie>

    suspend fun updateMovies(): List<Movie>
}