package com.example.daggerdemo.data.repository

import com.example.daggerdemo.data.model.Movie

interface LocalDbDataSource {

    suspend fun saveMovieIntoDb(movieList: List<Movie>)

    suspend fun getMovieFromDb(): List<Movie>

    suspend fun clearMovie()
}