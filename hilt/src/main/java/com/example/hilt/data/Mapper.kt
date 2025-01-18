package com.example.hilt.data

import android.util.Log
import com.example.hilt.domain.TextResponse
import javax.inject.Inject

class Mapper @Inject constructor() {
    fun mapToTextResponse(value: String): TextResponse = TextResponse(text = value)

    init {
        Log.d("HiltKoinMultiModule", "Hilt - Mapper init")
    }
}