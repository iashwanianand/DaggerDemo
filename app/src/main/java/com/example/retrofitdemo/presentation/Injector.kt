package com.example.retrofitdemo.presentation

import com.example.retrofitdemo.presentation.di.MovieSubComponent

interface Injector {
    fun createMovieSubComponent() : MovieSubComponent
}