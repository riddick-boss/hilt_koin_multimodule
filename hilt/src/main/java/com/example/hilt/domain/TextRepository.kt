package com.example.hilt.domain

interface TextRepository {
    suspend fun fetchText(): TextResponse
}