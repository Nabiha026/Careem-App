package com.yourapp.controllers

import com.yourapp.dto.RideDTO
import com.yourapp.services.RideService
import org.springframework.http.ResponseEntity
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/rides")
class RideController(private val rideService: RideService) {

    @PostMapping("/book")
    fun bookRide(
        @AuthenticationPrincipal user: com.google.firebase.auth.FirebaseToken,
        @RequestBody rideRequest: RideDTO.BookRide
    ): ResponseEntity<Any> {
        val result = rideService.bookRide(user.uid, rideRequest)
        return if (result.isSuccess) {
            ResponseEntity.ok(result.getOrNull())
        } else {
            ResponseEntity.badRequest().body(result.exceptionOrNull()?.message)
        }
    }

    @GetMapping("/{rideId}")
    fun getRideDetails(
        @PathVariable rideId: String,
        @AuthenticationPrincipal user: com.google.firebase.auth.FirebaseToken
    ): ResponseEntity<Any> {
        val result = rideService.getRideDetails(user.uid, rideId)
        return if (result.isSuccess) {
            ResponseEntity.ok(result.getOrNull())
        } else {
            ResponseEntity.badRequest().body(result.exceptionOrNull()?.message)
        }
    }

    // Additional endpoints like cancelRide, updateRideStatus, etc.
}
