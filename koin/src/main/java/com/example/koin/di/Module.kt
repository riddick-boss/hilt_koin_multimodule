package com.example.koin.di

import com.example.koin.data.ApiClient
import com.example.koin.data.LocalTextRepository
import com.example.koin.data.Mapper
import com.example.koin.domain.TextRepository
import com.example.koin.presentation.KoinViewModel
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val koinModule = module {
    single/*(named("foo"))*/ { ApiClient(initialDelayMillis = 4000L) }
    factoryOf(::LocalTextRepository) { bind<TextRepository>() }
//    factory<TextRepository> { LocalTextRepository(get(qualifier = named("foo")), get()) }
    factoryOf(::Mapper)

    viewModelOf(::KoinViewModel)
}