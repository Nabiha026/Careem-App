package com.example.careemapp
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FragmentOtp : Fragment(R.layout.fragment_otp) {

    private lateinit var otpDigit1: EditText
    private lateinit var otpDigit2: EditText
    private lateinit var otpDigit3: EditText
    private lateinit var otpDigit4: EditText
    private lateinit var resendCodeTimer: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Initialize views
        otpDigit1 = view.findViewById(R.id.otp_digit_1)
        otpDigit2 = view.findViewById(R.id.otp_digit_2)
        otpDigit3 = view.findViewById(R.id.otp_digit_3)
        otpDigit4 = view.findViewById(R.id.otp_digit_4)
        resendCodeTimer = view.findViewById(R.id.resend_code_timer)

        // Set up logic for handling OTP input
        setUpOtpInput()

        // Optional: Logic for Resend Code
        resendCodeTimer.setOnClickListener {
            resendOtpCode()
        }

        // Add logic for verifying the OTP here
        verifyOtp()
    }

    // Helper function to set up OTP input (you can add auto-focus to next EditText on typing)
    private fun setUpOtpInput() {
        otpDigit1.setOnKeyListener { _, _, _ ->
            if (otpDigit1.text.isNotEmpty()) otpDigit2.requestFocus()
            false
        }

        otpDigit2.setOnKeyListener { _, _, _ ->
            if (otpDigit2.text.isNotEmpty()) otpDigit3.requestFocus()
            false
        }

        otpDigit3.setOnKeyListener { _, _, _ ->
            if (otpDigit3.text.isNotEmpty()) otpDigit4.requestFocus()
            false
        }
    }

    // Function to handle OTP verification
    private fun verifyOtp() {
        // Collect OTP entered by the user
        val enteredOtp = "${otpDigit1.text}${otpDigit2.text}${otpDigit3.text}${otpDigit4.text}"

        // Mock verification logic for now (you would implement real API call here)
        if (enteredOtp.length == 4) {
            // Assuming OTP is "1234" for testing purposes
            if (enteredOtp == "1234") {
                Toast.makeText(requireContext(), "OTP Verified Successfully!", Toast.LENGTH_SHORT).show()
                // Navigate to the next screen or main activity
               /* findNavController().navigate(R.id.action_otpFragment_to_nextfragment)*/
            } else {
                Toast.makeText(requireContext(), "Invalid OTP", Toast.LENGTH_SHORT).show()
            }
        }
    }

    // Function to handle Resend OTP logic
    private fun resendOtpCode() {
        Toast.makeText(requireContext(), "OTP Resent", Toast.LENGTH_SHORT).show()
        // Logic to resend OTP (API call or SMS logic)
    }
}
