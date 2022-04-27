package com.example.daggerdemo.presentation

import com.example.daggerdemo.presentation.di.MovieSubComponent

interface Injector {
    fun createMovieSubComponent() : MovieSubComponent
}