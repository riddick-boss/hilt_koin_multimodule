package com.example.koin_annotations.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.koin_annotations.domain.TextRepository
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
class KoinAnnotationsViewModel(
    private val textRepository: TextRepository
) : ViewModel() {
    val textFlow: StateFlow<String> by lazy {
        flow { emit(textRepository.fetchText()) }
            .map { it.text }
            .stateIn(viewModelScope, SharingStarted.WhileSubscribed(), "")
    }
}