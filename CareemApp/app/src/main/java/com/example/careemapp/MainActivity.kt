package com.example.careemapp

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {
    private var bottomSheetDialog: BottomSheetDialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the NavHostFragment by its ID defined in activity_main.xml
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment

        // Get the NavController from NavHostFragment to manage fragment navigation
        val navController = navHostFragment.navController
    }

    fun openMenu() {
        // Use the class property bottomSheetDialog instead of creating a new variable
        bottomSheetDialog = BottomSheetDialog(this)
        val bottomSheetView = layoutInflater.inflate(R.layout.bottom_sheet_menu, null)

        // Set up the close button listener in the bottom sheet layout
        val closeButton = bottomSheetView.findViewById<ImageView>(R.id.close_button)
        closeButton.setOnClickListener {
            closeMenu()  // Call closeMenu to dismiss
        }

        // Set up listeners for menu buttons
        val homeButton = bottomSheetView.findViewById<View>(R.id.home_button)
        homeButton.setOnClickListener {
            navigateToHome(homeButton)
            closeMenu()  // Optionally close the menu after navigation
        }
        val profileButton = bottomSheetView.findViewById<View>(R.id.profile_button)
        homeButton.setOnClickListener {
            navigateToProfile(profileButton)
            closeMenu()  // Optionally close the menu after navigation
        }

        val activitiesButton = bottomSheetView.findViewById<View>(R.id.acitvity_button)
        activitiesButton.setOnClickListener {
            navigateToActivities(activitiesButton)
            closeMenu()  // Optionally close the menu after navigation
        }

        val helpButton = bottomSheetView.findViewById<View>(R.id.help_button)
        helpButton.setOnClickListener {
            navigateToHelp(helpButton)
            closeMenu()  // Optionally close the menu after navigation
        }

        bottomSheetDialog?.setContentView(bottomSheetView)
        bottomSheetDialog?.show()
    }

    fun closeMenu() {
        bottomSheetDialog?.dismiss()
    }

    // Navigation functions to replace the current fragment
    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.nav_host_fragment, fragment)  // Replace with your fragment container ID
            .addToBackStack(null)
            .commit()
    }

    fun navigateToHome(view: View) {
        replaceFragment(MainScreenFragment())  // Replace with your actual Home fragment
    }
    fun navigateToProfile(view: View) {
        replaceFragment(AllSetingsFragment())  // Replace with your actual Home fragment
    }

    fun navigateToActivities(view: View) {
        replaceFragment(AllServicesFragment())  // Replace with your actual Activities fragment
    }

    fun navigateToHelp(view: View) {
        replaceFragment(HelpFragment())  // Replace with your actual Help fragment
    }
}
