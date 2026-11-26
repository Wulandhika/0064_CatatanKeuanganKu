package com.example.mytugasakhir.model

data class SavingsGoal(
    val id: Long = 0,
    val user_id: Long = 0,
    val goal_name: String = "",
    val target_amount: String = "0",
    val current_amount: String = "0",
    val target_date: String? = null
)