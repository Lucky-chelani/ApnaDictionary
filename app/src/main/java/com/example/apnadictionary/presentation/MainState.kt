package com.example.apnadictionary.presentation

import com.example.apnadictionary.domain.model.WordItem

data class MainState(
    val isLoading: Boolean = false,
    val searchWord: String = "",

    val wordItem: WordItem? = null
)