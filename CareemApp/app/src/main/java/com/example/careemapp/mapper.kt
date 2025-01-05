package com.yourapp.utils

import com.yourapp.dto.RideDTO
import com.yourapp.dto.UserDTO
import com.yourapp.models.Ride
import com.yourapp.models.User

object Mapper {

    fun toRideResponse(ride: Ride): RideDTO.RideResponse {
        return RideDTO.RideResponse(
            id = ride.id,
            userId = ride.userId,
            driverId = ride.driverId,
            pickupLocation = ride.pickupLocation,
            dropoffLocation = ride.dropoffLocation,
            status = ride.status,
            fare = ride.fare,
            createdAt = ride.createdAt,
            updatedAt = ride.updatedAt
        )
    }

    fun toUserProfile(user: User): UserDTO.Register {
        return UserDTO.Register(
            email = user.email,
            password = "", // Password is not sent back
            displayName = user.displayName,
            phoneNumber = user.phoneNumber
        )
    }

    // Add more mapping functions as needed
}
