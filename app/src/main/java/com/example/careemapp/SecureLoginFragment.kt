package com.example.careemapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class SecureLoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the correct layout for SecureLoginFragment
        return inflater.inflate(R.layout.fragment_secure_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Find the "I'll do this later" button in the layout
        val doLaterButton = view.findViewById<Button>(R.id.do_later_button)

        // Set a click listener to navigate to AllSettingsFragment
        doLaterButton.setOnClickListener {
            // Navigate to AllSettingsFragment using the navigation action
            findNavController().navigate(R.id.action_secureLoginFragment_to_mainFragment)
        }
    }
}
