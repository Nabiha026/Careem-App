package com.yourapp.models

import javax.persistence.*

@Entity
@Table(name = "users")
data class User(
    @Id val uid: String,
    val email: String,
    val displayName: String,
    val phoneNumber: String?,
    val createdAt: Long
    // Additional fields...
)
