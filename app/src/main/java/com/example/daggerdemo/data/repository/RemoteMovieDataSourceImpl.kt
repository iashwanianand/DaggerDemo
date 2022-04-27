package com.example.daggerdemo.data.repository

import com.example.daggerdemo.data.api.TmdbApi
import com.example.daggerdemo.data.model.MovieList
import retrofit2.Response

class RemoteMovieDataSourceImpl(private val tmdbApi: TmdbApi, private val apiKey: String) :
    RemoteMovieDataSource {

    override suspend fun getMovie(): Response<MovieList> {
        return tmdbApi.getMovie(apiKey)
    }
}