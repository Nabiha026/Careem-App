package com.yourapp.repositories

import com.yourapp.models.Payment
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PaymentRepository : JpaRepository<Payment, Long> {
    fun findByRideId(rideId: Long): List<Payment>
    // Additional query methods if needed
}
