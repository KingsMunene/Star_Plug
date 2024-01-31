package com.example.starplug.data

import kotlinx.serialization.Serializable

@Serializable
data class Species(
    val name: String,
    val language: String
)
