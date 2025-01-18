package com.example.hilt.presentation.hiltscreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hilt.domain.TextRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class HiltViewModel @Inject constructor(
    private val textRepository: TextRepository
) : ViewModel() {
    val textFlow: StateFlow<String> by lazy {
        flow { emit(textRepository.fetchText()) }
            .map { it.text }
            .stateIn(viewModelScope, SharingStarted.WhileSubscribed(), "")
    }
}