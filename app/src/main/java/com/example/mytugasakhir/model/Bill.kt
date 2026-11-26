package com.example.mytugasakhir.model

data class Bill(
    val id: Long = 0,
    val user_id: Long = 0,
    val bill_name: String = "",
    val amount: String = "0",
    val due_date: String = "",
    val status: String = "belum_lunas",
    val notes: String? = null
)