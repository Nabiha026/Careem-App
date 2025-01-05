package com.yourapp.models

import javax.persistence.*

@Entity
@Table(name = "rides")
data class Ride(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val userId: String,
    val driverId: String?,
    val pickupLocation: String,
    val dropoffLocation: String,
    val status: String, // e.g., "Pending", "Completed", "Cancelled"
    val fare: Double,
    val createdAt: Long,
    val updatedAt: Long
    // Additional fields...
)
