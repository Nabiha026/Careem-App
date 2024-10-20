package com.example.careemapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class PhoneNumberFragment : Fragment(R.layout.fragment_phone_number) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val continueButton = view.findViewById<Button>(R.id.continueButton)
        continueButton.setOnClickListener {
            // Navigate to the next screen after entering the phone number
            findNavController().navigate(R.id.action_phoneNumberFragment_to_nextFragment)
        }
    }
}

