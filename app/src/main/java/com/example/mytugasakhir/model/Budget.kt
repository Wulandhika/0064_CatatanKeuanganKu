package com.example.mytugasakhir.model

data class Budget(
    val id: Long = 0,
    val user_id: Long = 0,
    val category_id: Long = 0,
    val limit_amount: String = "0",
    val month: Int = 1,
    val year: Int = 2026
)