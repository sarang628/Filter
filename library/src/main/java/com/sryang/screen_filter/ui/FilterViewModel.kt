package com.sryang.screen_filter.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class FilterViewModel @Inject constructor() : ViewModel() {
    private val _uiState = MutableStateFlow(FilterUiState(""))
    val uiState = _uiState.asStateFlow()

    fun setType(s: String) {
        viewModelScope.launch {
            _uiState.emit(
                uiState.value.copy(
                    type = if (uiState.value.type == s) "" else s
                )
            )
        }
    }
}