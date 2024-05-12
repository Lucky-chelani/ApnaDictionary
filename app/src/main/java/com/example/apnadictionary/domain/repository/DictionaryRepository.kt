package com.example.apnadictionary.domain.repository

import com.example.apnadictionary.domain.model.WordItem
import com.example.apnadictionary.util.Result
import kotlinx.coroutines.flow.Flow

interface DictionaryRepository {
    suspend fun getWordResult(
        word: String
    ): Flow<Result<WordItem>>
}