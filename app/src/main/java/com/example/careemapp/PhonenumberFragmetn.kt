package com.example.careemapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class PhoneNumberFragment : Fragment(R.layout.fragment_phone_number) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Setup the continue button to navigate to OTP fragment
        val continueButton = view.findViewById<Button>(R.id.continueButton)
        continueButton.setOnClickListener {
            // Navigate to the OTP fragment
            findNavController().navigate(R.id.action_phoneNumberFragment_to_otpFragment)
        }

        // Setup the back arrow to navigate back to the Welcome fragment
        val backButton = view.findViewById<ImageView>(R.id.backarrow)
        backButton.setOnClickListener {
            // Navigate back to the Welcome fragment
            findNavController().navigate(R.id.action_phoneNumberFragment_to_welcomeFragment)
        }
    }
}

