package com.example.retrofitdemo.data.repository

import com.example.retrofitdemo.data.model.Movie

interface LocalDbDataSource {

    suspend fun saveMovieIntoDb(movieList: List<Movie>)

    suspend fun getMovieFromDb(): List<Movie>

    suspend fun clearMovie()
}