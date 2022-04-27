package com.example.retrofitdemo.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.retrofitdemo.R
import com.example.retrofitdemo.data.model.Movie
import com.example.retrofitdemo.databinding.ActivityMovieBinding
import javax.inject.Inject

class MovieActivity : AppCompatActivity() {
    @Inject
    lateinit var factory: MovieViewModelFactory
    lateinit var binding: ActivityMovieBinding
    lateinit var movieViewModel: MovieViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_movie)

        (application as Injector).createMovieSubComponent().inject(this)
        movieViewModel = ViewModelProvider(this, factory)[MovieViewModel::class.java]
        val responseLiveData : LiveData<List<Movie>?> = movieViewModel.getMovies()

        responseLiveData.observe(this, Observer {
            Log.d("TAG", it.toString())
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater : MenuInflater =menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.action_update) {
            val responseLiveData : LiveData<List<Movie>?> = movieViewModel.updateMovies()
            responseLiveData.observe(this, Observer {
                Log.d("TAG", it.toString())
            })
        }
        return super.onOptionsItemSelected(item)
    }
}