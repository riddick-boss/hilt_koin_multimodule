package com.example.koin.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.koin.domain.TextRepository
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn

class KoinViewModel(
    private val textRepository: TextRepository
) : ViewModel() {
    val textFlow: StateFlow<String> by lazy {
        flow { emit(textRepository.fetchText()) }
            .map { it.text }
            .stateIn(viewModelScope, SharingStarted.WhileSubscribed(), "")
    }
}