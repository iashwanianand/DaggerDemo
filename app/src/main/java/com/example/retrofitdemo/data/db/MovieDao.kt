package com.example.retrofitdemo.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.retrofitdemo.data.model.Movie

@Dao
interface MovieDao {

    @Insert
    suspend fun insertMovies(movie: List<Movie>): Long

    @Update
    suspend fun updateMovies(movie: List<Movie>): Long

    @Query("SELECT * FROM movie_table")
    suspend fun getMovies(): List<Movie>

    @Query("DELETE FROM movie_table")
    suspend fun clearAllMovies()
}