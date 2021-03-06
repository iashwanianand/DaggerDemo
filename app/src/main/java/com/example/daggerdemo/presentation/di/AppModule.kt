package com.example.daggerdemo.presentation.di

import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(private val context: Context) {

    @Singleton
    @Provides
    fun provideAppModuleContext() : Context {
        return context.applicationContext
    }
}