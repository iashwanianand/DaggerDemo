package com.example.daggerdemo.data.api

import com.example.daggerdemo.data.model.MovieList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TmdbApi {

    @GET("movie/popular")
    suspend fun getMovie(@Query("api_key") apikey: String): Response<MovieList>
}