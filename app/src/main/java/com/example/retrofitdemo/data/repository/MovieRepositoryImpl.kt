package com.example.retrofitdemo.data.repository

import com.example.retrofitdemo.data.model.Movie
import com.example.retrofitdemo.domain.MovieRepository
import retrofit2.Response

class MovieRepositoryImpl(
    private val remoteMovieDataSourceImpl: RemoteMovieDataSourceImpl,
    private val localDbDataSourceImpl: LocalDbDataSourceImpl,
    private val cacheMovieDataSourceImpl: CacheMovieDataSourceImpl
) : MovieRepository {

    override suspend fun getMovies(): List<Movie> {
        TODO("Not yet implemented")
    }

    override suspend fun updateMovies(): List<Movie> {
        TODO("Not yet implemented")
    }

    suspend fun getMovieFromApi(): List<Movie> {
        lateinit var listMovie: List<Movie>

        val response: Response<List<Movie>> = remoteMovieDataSourceImpl.getMovie()

        if (response != null) {
            listMovie = response.body()!!
        }
        return listMovie
    }

    suspend fun saveMovieIntoLocalDb() {
        val listMovie: List<Movie> = getMovieFromApi()

        if (listMovie.isNotEmpty()) {
            localDbDataSourceImpl.saveMovieIntoDb(listMovie)
        } else {
            getMovieFromApi()
        }
    }
}