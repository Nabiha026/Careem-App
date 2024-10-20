package com.example.careemapp
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
class WelcomeFragment : Fragment(R.layout.fragment_welcome) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val phoneButton = view.findViewById<Button>(R.id.proceedButton)
        phoneButton.setOnClickListener {
            // Navigate to the phone number input fragment
            findNavController().navigate(R.id.action_welcomeFragment_to_phoneNumberFragment)
        }
    }
}
