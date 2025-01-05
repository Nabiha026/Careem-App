package com.yourapp.security

import com.google.firebase.auth.FirebaseToken
import org.springframework.security.core.Authentication
import org.springframework.security.core.GrantedAuthority

class FirebaseAuthentication(
    private val firebaseToken: FirebaseToken
) : Authentication {

    override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
        return mutableListOf()
    }

    override fun getCredentials(): Any {
        return firebaseToken.token
    }

    override fun getDetails(): Any? {
        return firebaseToken
    }

    override fun getPrincipal(): Any {
        return firebaseToken.uid
    }

    override fun isAuthenticated(): Boolean {
        return true
    }

    override fun setAuthenticated(isAuthenticated: Boolean) {
        // No implementation needed
    }

    override fun getName(): String {
        return firebaseToken.uid
    }
}
