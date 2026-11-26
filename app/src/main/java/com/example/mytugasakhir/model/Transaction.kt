package com.example.mytugasakhir.model

data class Transaction(
    val id: Long = 0,
    val user_id: Long = 0,
    val category_id: Long = 0,
    val amount: String = "0",
    val description: String? = null,
    val transaction_date: String = ""
)