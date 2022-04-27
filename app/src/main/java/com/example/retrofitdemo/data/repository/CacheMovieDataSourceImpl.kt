package com.example.retrofitdemo.data.repository

import com.example.retrofitdemo.data.model.Movie

class CacheMovieDataSourceImpl : CacheMovieDataSource {
    private var movieList = ArrayList<Movie>()

    override suspend fun getMovieFromCache(): List<Movie> {
        return movieList
    }

    override suspend fun saveMovieIntoCache(listMovie: List<Movie>) {
        movieList.clear()
        movieList = ArrayList(listMovie)
    }
}