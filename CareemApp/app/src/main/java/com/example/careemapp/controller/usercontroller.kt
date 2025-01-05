package com.yourapp.controllers

import com.yourapp.dto.UserDTO
import com.yourapp.services.UserService
import org.springframework.http.ResponseEntity
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController(private val userService: UserService) {

    @GetMapping("/profile")
    fun getProfile(
        @AuthenticationPrincipal user: com.google.firebase.auth.FirebaseToken
    ): ResponseEntity<Any> {
        val result = userService.getUserProfile(user.uid)
        return if (result.isSuccess) {
            ResponseEntity.ok(result.getOrNull())
        } else {
            ResponseEntity.badRequest().body(result.exceptionOrNull()?.message)
        }
    }

    @PutMapping("/profile")
    fun updateProfile(
        @AuthenticationPrincipal user: com.google.firebase.auth.FirebaseToken,
        @RequestBody profileUpdate: UserDTO.UpdateProfile
    ): ResponseEntity<Any> {
        val result = userService.updateUserProfile(user.uid, profileUpdate)
        return if (result.isSuccess) {
            ResponseEntity.ok(result.getOrNull())
        } else {
            ResponseEntity.badRequest().body(result.exceptionOrNull()?.message)
        }
    }

    // Additional endpoints like deleteProfile, etc.
}