package com.yourapp.dto

data class RideDTO(
    val userId: String,
    val pickupLocation: String,
    val dropoffLocation: String,
    val status: String,
    val fare: Double,
    val createdAt: Long,
    val updatedAt: Long
) {
    data class BookRide(
        val pickupLocation: String,
        val dropoffLocation: String
        // Additional fields like vehicle type, preferences, etc.
    )

    data class RideResponse(
        val id: Long,
        val userId: String,
        val driverId: String?,
        val pickupLocation: String,
        val dropoffLocation: String,
        val status: String,
        val fare: Double,
        val createdAt: Long,
        val updatedAt: Long
    )
}
payment