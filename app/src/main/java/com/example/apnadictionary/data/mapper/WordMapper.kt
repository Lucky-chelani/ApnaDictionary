package com.example.apnadictionary.data.mapper

import com.example.apnadictionary.data.dto.DefinitionDto
import com.example.apnadictionary.data.dto.MeaningDto
import com.example.apnadictionary.data.dto.WordItemDto
import com.example.apnadictionary.domain.model.Definition
import com.example.apnadictionary.domain.model.Meaning
import com.example.apnadictionary.domain.model.WordItem

fun WordItemDto.toWordItem() = WordItem (
    word = word ?: "",
    meanings = meanings?.map {
        it.toMeaning()
    } ?: emptyList(),
    phonetic = phonetic ?: ""
)

fun MeaningDto.toMeaning() = Meaning(
    definition = definitionDtoToDefinition(definitions?.get(0)),
    partOfSpeech = partOfSpeech ?: ""
)


fun definitionDtoToDefinition(
    definitionDto: DefinitionDto?
) = Definition(
    definition = definitionDto?.definition ?: "",
    example = definitionDto?.example ?: ""
)