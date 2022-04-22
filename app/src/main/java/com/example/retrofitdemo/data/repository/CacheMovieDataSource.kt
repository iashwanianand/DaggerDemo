package com.example.retrofitdemo.data.repository

import com.example.retrofitdemo.data.model.Movie

interface CacheMovieDataSource {

    suspend fun getMovieFromCache() : List<Movie>

    suspend fun saveMovieIntoCache(listMovie : List<Movie>)
}