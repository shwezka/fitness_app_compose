package com.example.fitness_app.DataClass

import androidx.compose.runtime.MutableState

data class UserClass (
    val id: Int,
    val mail: MutableState <String>,
    val number: MutableState <String>,
    val gender: MutableState<Boolean>,
)

