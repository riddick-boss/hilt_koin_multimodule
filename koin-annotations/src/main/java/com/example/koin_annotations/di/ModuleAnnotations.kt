package com.example.koin_annotations.di

import com.example.koin_annotations.data.ApiClient
import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module
import org.koin.core.annotation.Single

@Module
@ComponentScan("com.example.koin_annotations")
class ModuleAnnotations {
    @Single
//    @Named("foo")
    fun provideApiClient(): ApiClient {
        return ApiClient(initialDelayMillis = 4000L)
    }
}