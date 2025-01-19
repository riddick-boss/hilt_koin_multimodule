package com.example.koin_annotations.data

import android.util.Log
import com.example.koin_annotations.domain.TextResponse
import org.koin.core.annotation.Factory

@Factory
class Mapper {
    fun mapToTextResponse(value: String): TextResponse = TextResponse(text = value)

    init {
        Log.d("HiltKoinMultiModule", "Koin Annotations - Mapper init")
    }
}