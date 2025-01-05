package com.yourapp.repositories

import com.yourapp.models.Ride
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RideRepository : JpaRepository<Ride, Long> {
    fun findByUserId(userId: String): List<Ride>
    // Additional query methods if needed
}
