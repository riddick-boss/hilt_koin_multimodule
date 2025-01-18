package com.example.hilt.data

import android.util.Log
import kotlinx.coroutines.delay

//this is dummy api client
class ApiClient(
    private val initialDelayMillis: Long
) {
    suspend fun fetchText(): String {
        delay(initialDelayMillis)
        return "Dummy Text"
    }

    init {
        Log.d("HiltKoinMultiModule", "Hilt - ApiClient init")
    }
}