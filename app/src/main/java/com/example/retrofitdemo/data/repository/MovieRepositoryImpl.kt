package com.example.retrofitdemo.data.repository

import android.util.Log
import com.example.retrofitdemo.data.model.Movie
import com.example.retrofitdemo.data.model.MovieList
import com.example.retrofitdemo.domain.MovieRepository
import retrofit2.Response
import java.lang.Exception

class MovieRepositoryImpl(private val remoteMovieDataSource: RemoteMovieDataSource,
                          private val localDbDataSource: LocalDbDataSource,
                          private val cacheMovieDataSource: CacheMovieDataSource) : MovieRepository {

    override suspend fun getMovies(): List<Movie> {
        return getMovieFromCache()
    }

    override suspend fun updateMovies(): List<Movie> {
        val newMovieList = getMovieFromApi()
        localDbDataSource.clearMovie()
        localDbDataSource.saveMovieIntoDb(newMovieList)
        cacheMovieDataSource.saveMovieIntoCache(newMovieList)
        return newMovieList
    }

    private suspend fun getMovieFromApi(): List<Movie> {
        lateinit var movieList : List<Movie>
        try {
            val response : Response<MovieList> = remoteMovieDataSource.getMovie()
            val body : MovieList? = response.body()
            if (body!= null){
                movieList = body.movie
            }
        }catch (exception : Exception){
            Log.d("MyTag", exception.message.toString())
        }
        return movieList
    }

    suspend fun getMovieFromLocalDB(): List<Movie> {
        lateinit var movieList : List<Movie>
        try {
            movieList = localDbDataSource.getMovieFromDb()
        }catch (exception : Exception){
            Log.d("MyTag", exception.message.toString())
        }
        if (movieList.size > 0){
            return movieList
        }else{
            movieList = getMovieFromApi()
            localDbDataSource.saveMovieIntoDb(movieList)
        }
        return movieList
    }

    suspend fun getMovieFromCache() : List<Movie>{
        lateinit var movieList : List<Movie>
        try {
            movieList = cacheMovieDataSource.getMovieFromCache()
        }catch (exception : Exception){
            Log.d("MyTag", exception.message.toString())
        }
        if (movieList.size > 0){
            return movieList
        }else{
            movieList = getMovieFromLocalDB()
            cacheMovieDataSource.saveMovieIntoCache(movieList)
        }
        return movieList
    }
}