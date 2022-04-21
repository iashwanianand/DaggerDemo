package com.example.retrofitdemo.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.retrofitdemo.model.Movie

@Dao
interface MovieDao {

    @Insert
    suspend fun insertMovies(movie: List<Movie>): Long

    @Update
    suspend fun updateMovies(movie: List<Movie>): Long

    @Query("SELECT * FROM movie_table")
    suspend fun getMovies(movie: List<Movie>)

    @Query("DELETE FROM movie_table")
    suspend fun clearAllMovies()
}