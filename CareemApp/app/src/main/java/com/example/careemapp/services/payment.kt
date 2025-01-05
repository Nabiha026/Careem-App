package com.yourapp.models

import javax.persistence.*

@Entity
@Table(name = "payments")
data class Payment(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val rideId: Long,
    val amount: Double,
    val paymentMethod: String, // e.g., "Credit Card", "Cash"
    val status: String, // e.g., "Completed", "Failed"
    val transactionId: String?,
    val createdAt: Long
    // Additional fields...
)
