package com.example.starplug.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Character(
    val name: String,
    @SerialName(value = "birth_year")
    val birthYear: String,
    val height: String,
    @SerialName(value = "homeworld")
    val homePlanet: String,
    val films: List<String>,
    val species: String?
)
