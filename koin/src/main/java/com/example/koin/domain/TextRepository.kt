package com.example.koin.domain

interface TextRepository {
    suspend fun fetchText(): TextResponse
}