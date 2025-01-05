package com.yourapp.dto

data class PaymentDTO(
    val rideId: Long,
    val amount: Double,
    val paymentMethod: String,
    val status: String,
    val transactionId: String?,
    val createdAt: Long
)
