package com.example.starplug.utils

import com.example.starplug.data.Results
import com.example.starplug.data.StarCharacter

sealed class StarUiState {
    object Loading: StarUiState()

    object Error: StarUiState()

    data class Success(
        val characters: List<StarCharacter>,
//        val planetUrl: String,
//        val speciesUrl: String?,
//        val filmsUrl: List<String>
    ): StarUiState()
}