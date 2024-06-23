package com.example.firebase.model

import com.google.gson.annotations.SerializedName

data class SpriteModel(
    @SerializedName("back_shiny")
    val backDetails: String,
    @SerializedName("front_shiny")
    val frontDetails: String
)
