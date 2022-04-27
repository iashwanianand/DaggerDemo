package com.example.daggerdemo.data.db

import androidx.room.*
import com.example.daggerdemo.data.model.Movie

@Dao
interface MovieDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMovies(movie: List<Movie>)

    @Update
    suspend fun updateMovies(movie: List<Movie>)

    @Query("SELECT * FROM movie_table")
    suspend fun getMovies(): List<Movie>

    @Query("DELETE FROM movie_table")
    suspend fun clearAllMovies()
}