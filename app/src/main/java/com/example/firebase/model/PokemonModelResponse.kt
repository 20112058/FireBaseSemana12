package com.example.firebase.model

data class PokemonModelResponse(
    val count: Int,
    val next: String,
    val previous: String,
    val results: List<PokemonModel>
)
