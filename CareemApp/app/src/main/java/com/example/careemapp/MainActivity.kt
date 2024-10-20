package com.example.careemapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set the content view to activity_main.xml
        setContentView(R.layout.activity_main)

        // Find the NavHostFragment by its ID defined in activity_main.xml
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment

        // Get the NavController from NavHostFragment to manage fragment navigation
        val navController = navHostFragment.navController
    }
}
