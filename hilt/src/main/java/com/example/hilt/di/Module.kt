package com.example.hilt.di

import com.example.hilt.data.ApiClient
import com.example.hilt.data.LocalTextRepository
import com.example.hilt.domain.TextRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class Module {
    @Binds
    abstract fun bindTextRepository(impl: LocalTextRepository): TextRepository

    companion object {
        @Provides
        @Singleton
        fun provideApiClient(): ApiClient = ApiClient(initialDelayMillis = 4000L)
    }
}