package com.yourapp.config

import com.google.auth.oauth2.GoogleCredentials
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import org.springframework.context.annotation.Configuration
import javax.annotation.PostConstruct
import org.springframework.beans.factory.annotation.Value
import java.io.FileInputStream

@Configuration
class FirebaseConfig(
    @Value("\${firebase.service-account}") private val serviceAccountPath: String
) {

    @PostConstruct
    fun initialize() {
        if (FirebaseApp.getApps().isEmpty()) {
            val serviceAccount = FileInputStream(serviceAccountPath)

            val options = FirebaseOptions.builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .build()

            FirebaseApp.initializeApp(options)
        }
    }
}
