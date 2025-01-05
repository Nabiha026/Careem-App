package com.yourapp.dto

data class UserDTO(
    val email: String,
    val password: String,
    val displayName: String,
    val phoneNumber: String?
) {
    data class Register(
        val email: String,
        val password: String,
        val displayName: String,
        val phoneNumber: String?
    )

    data class Login(
        val email: String,
        val password: String
    )

    data class UpdateProfile(
        val displayName: String?,
        val phoneNumber: String?
    )
}
