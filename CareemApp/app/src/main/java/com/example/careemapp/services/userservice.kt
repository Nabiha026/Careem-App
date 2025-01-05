package com.yourapp.services

import com.yourapp.dto.UserDTO
import com.yourapp.models.User
import com.yourapp.repositories.UserRepository
import org.springframework.stereotype.Service
import java.lang.Exception

@Service
class UserService(
    private val userRepository: UserRepository
) {

    fun getUserProfile(userId: String): Result<User> {
        return try {
            val user = userRepository.findById(userId).orElseThrow { Exception("User not found") }
            Result.success(user)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    fun updateUserProfile(userId: String, profileUpdate: UserDTO.UpdateProfile): Result<User> {
        return try {
            val user = userRepository.findById(userId).orElseThrow { Exception("User not found") }
            val updatedUser = user.copy(
                displayName = profileUpdate.displayName ?: user.displayName,
                phoneNumber = profileUpdate.phoneNumber ?: user.phoneNumber
                // Update other fields as needed
            )
            userRepository.save(updatedUser)
            Result.success(updatedUser)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    // Additional methods like deleteUser, etc.
}
