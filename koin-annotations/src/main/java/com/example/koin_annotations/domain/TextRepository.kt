package com.example.koin_annotations.domain

interface TextRepository {
    suspend fun fetchText(): TextResponse
}