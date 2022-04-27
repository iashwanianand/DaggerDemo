package com.example.daggerdemo.presentation.di

import com.example.daggerdemo.data.repository.CacheMovieDataSource
import com.example.daggerdemo.data.repository.LocalDbDataSource
import com.example.daggerdemo.data.repository.MovieRepositoryImpl
import com.example.daggerdemo.data.repository.RemoteMovieDataSource
import com.example.daggerdemo.domain.MovieRepository
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
