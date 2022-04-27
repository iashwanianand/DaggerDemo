package com.example.retrofitdemo.data.repository

import com.example.retrofitdemo.data.model.MovieList
import retrofit2.Response

interface RemoteMovieDataSource {

    suspend fun getMovie(): Response<MovieList>
}