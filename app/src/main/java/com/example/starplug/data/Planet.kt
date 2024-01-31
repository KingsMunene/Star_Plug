package com.example.starplug.data

import kotlinx.serialization.Serializable

@Serializable
data class Planet(
    val name: String,
    val population: String
)
