package com.example.retrofitdemo.data.api

import com.example.retrofitdemo.data.model.Movie
import retrofit2.http.GET
import retrofit2.http.Query

interface TmdbApi {

    @GET("/movie/popular")
    suspend fun getMovies(@Query("api_key") apikey: String): List<Movie>
}