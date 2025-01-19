package com.example.koin_annotations.data

import android.util.Log
import com.example.koin_annotations.domain.TextRepository
import com.example.koin_annotations.domain.TextResponse
import org.koin.core.annotation.Factory

@Factory
class LocalTextRepository(
    /*@Named("foo")*/ private val apiClient: ApiClient,
    private val mapper: Mapper
) : TextRepository {
    override suspend fun fetchText(): TextResponse {
        val text = apiClient.fetchText()
        return mapper.mapToTextResponse(text)
    }

    init {
        Log.d("HiltKoinMultiModule", "Koin Annotations - LocalTextRepository init")
    }
}