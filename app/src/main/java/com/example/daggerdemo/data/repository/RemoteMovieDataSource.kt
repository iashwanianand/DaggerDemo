package com.example.daggerdemo.data.repository

import com.example.daggerdemo.data.model.MovieList
import retrofit2.Response

interface RemoteMovieDataSource {

    suspend fun getMovie(): Response<MovieList>
}