package com.example.retrofitdemo.presentation.di

import com.example.retrofitdemo.data.repository.CacheMovieDataSource
import com.example.retrofitdemo.data.repository.LocalDbDataSource
import com.example.retrofitdemo.data.repository.MovieRepositoryImpl
import com.example.retrofitdemo.data.repository.RemoteMovieDataSource
import com.example.retrofitdemo.domain.MovieRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class RepositoryModule {
    @Singleton
    @Provides
    fun provideMovieRepository(movieRemoteDatasource: RemoteMovieDataSource,
                               movieLocalDatasource: LocalDbDataSource,
                               movieCacheDatasource: CacheMovieDataSource
    ) : MovieRepository {
        return MovieRepositoryImpl(movieRemoteDatasource, movieLocalDatasource, movieCacheDatasource)
    }
}
