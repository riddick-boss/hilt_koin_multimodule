package com.example.koin.data

import android.util.Log
import com.example.koin.domain.TextRepository
import com.example.koin.domain.TextResponse

class LocalTextRepository(
    private val apiClient: ApiClient,
    private val mapper: Mapper
) : TextRepository {
    override suspend fun fetchText(): TextResponse {
        val text = apiClient.fetchText()
        return mapper.mapToTextResponse(text)
    }

    init {
        Log.d("HiltKoinMultiModule", "Koin - LocalTextRepository init")
    }
}