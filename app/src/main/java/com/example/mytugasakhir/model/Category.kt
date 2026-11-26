package com.example.mytugasakhir.model

data class Category(
    val id: Long = 0,
    val user_id: Long? = null,
    val name: String = "",
    val type: String = "expense",
    val is_global: Boolean = false
)