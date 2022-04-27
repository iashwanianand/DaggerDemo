package com.example.retrofitdemo.data.repository

import com.example.retrofitdemo.data.db.MovieDao
import com.example.retrofitdemo.data.model.Movie
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LocalDbDataSourceImpl(private val dao: MovieDao) : LocalDbDataSource {

    override suspend fun saveMovieIntoDb(movieList: List<Movie>) {
        CoroutineScope(Dispatchers.IO).launch {
            dao.insertMovies(movieList)
        }
    }

    override suspend fun getMovieFromDb(): List<Movie> {
        return dao.getMovies()
    }

    override suspend fun clearMovie() {
        dao.clearAllMovies()
    }
}
