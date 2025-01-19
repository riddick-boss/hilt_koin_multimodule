package com.example.hilt.data

import android.util.Log
import com.example.hilt.domain.TextRepository
import com.example.hilt.domain.TextResponse
import javax.inject.Inject

class LocalTextRepository @Inject constructor(
    /*@Named("foo")*/ private val apiClient: ApiClient,
    private val mapper: Mapper
) : TextRepository {
    override suspend fun fetchText(): TextResponse {
        val text = apiClient.fetchText()
        return mapper.mapToTextResponse(text)
    }

    init {
        Log.d("HiltKoinMultiModule", "Hilt - LocalTextRepository init")
    }
}