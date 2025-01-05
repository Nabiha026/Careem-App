package com.example.careemapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth

class SignupFragment : Fragment() {

    private lateinit var auth: FirebaseAuth

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_signup, container, false)

        // Initialize Firebase Auth
        auth = FirebaseAuth.getInstance()

        // UI elements
        val emailEditText = view.findViewById<EditText>(R.id.signupEmailEditText)
        val passwordEditText = view.findViewById<EditText>(R.id.signupPasswordEditText)
        val confirmPasswordEditText = view.findViewById<EditText>(R.id.signupConfirmPasswordEditText)
        val signupButton = view.findViewById<Button>(R.id.signupButton)
        val loginRedirectButton = view.findViewById<Button>(R.id.loginRedirectButton)

        // Signup Button Click Listener
        signupButton.setOnClickListener {
            val email = emailEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()
            val confirmPassword = confirmPasswordEditText.text.toString().trim()

            if (email.isNotEmpty() && password.isNotEmpty() && confirmPassword.isNotEmpty()) {
                if (password == confirmPassword) {
                    auth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener { task ->
                            if (task.isSuccessful) {
                                Toast.makeText(requireContext(), "Signup Successful", Toast.LENGTH_SHORT).show()
                                findNavController().navigate(R.id.action_signupFragment_to_loginFragment)
                            } else {
                                Toast.makeText(requireContext(), "Signup Failed: ${task.exception?.message}", Toast.LENGTH_SHORT).show()
                            }
                        }
                } else {
                    Toast.makeText(requireContext(), "Passwords do not match", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(requireContext(), "Please fill in all fields", Toast.LENGTH_SHORT).show()
            }
        }

        // Redirect to Login Screen
        loginRedirectButton.setOnClickListener {
            findNavController().navigate(R.id.action_signupFragment_to_loginFragment)
        }

        return view
    }
}
