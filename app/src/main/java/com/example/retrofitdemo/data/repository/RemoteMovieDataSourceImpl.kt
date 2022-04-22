package com.example.retrofitdemo.data.repository

import com.example.retrofitdemo.data.api.TmdbApi
import com.example.retrofitdemo.data.model.Movie
import retrofit2.Response

class RemoteMovieDataSourceImpl(private val tmdbApi: TmdbApi, private val apiKey: String) :
    RemoteMovieDataSource {

    override suspend fun getMovie(): Response<List<Movie>> {
        return tmdbApi.getMovie(apiKey)
    }
}