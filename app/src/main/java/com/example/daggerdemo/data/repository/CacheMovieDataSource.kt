package com.example.daggerdemo.data.repository

import com.example.daggerdemo.data.model.Movie

interface CacheMovieDataSource {

    suspend fun getMovieFromCache(): List<Movie>

    suspend fun saveMovieIntoCache(listMovie: List<Movie>)
}