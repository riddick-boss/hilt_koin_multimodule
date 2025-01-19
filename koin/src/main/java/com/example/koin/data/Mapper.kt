package com.example.koin.data

import android.util.Log
import com.example.koin.domain.TextResponse

class Mapper {
    fun mapToTextResponse(value: String): TextResponse = TextResponse(text = value)

    init {
        Log.d("HiltKoinMultiModule", "Koin - Mapper init")
    }
}