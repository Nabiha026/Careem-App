package com.yourapp.services

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.UserRecord
import com.yourapp.dto.UserDTO
import com.yourapp.models.User
import com.yourapp.repositories.UserRepository
import org.springframework.stereotype.Service
import java.lang.Exception

@Service
class AuthService(
    private val firebaseAuth: FirebaseAuth,
    private val userRepository: UserRepository
) {

    fun register(userDTO: UserDTO.Register): Result<User> {
        return try {
            val userRecord = firebaseAuth.createUser(UserRecord.CreateRequest()
                .setEmail(userDTO.email)
                .setPassword(userDTO.password)
                .setDisplayName(userDTO.displayName)
                .setPhoneNumber(userDTO.phoneNumber)
            )

            val user = User(
                uid = userRecord.uid,
                email = userRecord.email ?: "",
                displayName = userRecord.displayName ?: "",
                phoneNumber = userRecord.phoneNumber,
                createdAt = System.currentTimeMillis()
            )

            userRepository.save(user)
            Result.success(user)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    fun login(userDTO: UserDTO.Login): Result<String> {
        // Since Firebase Authentication is typically handled on the client side,
        // the backend might verify ID tokens or handle additional logic.
        // For simplicity, we'll assume the client sends a valid ID token.

        // This method can be expanded based on your authentication flow.
        return Result.success("Login successful")
    }
}
