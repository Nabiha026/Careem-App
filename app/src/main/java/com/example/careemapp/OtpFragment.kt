package com.example.careemapp
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


class FragmentOtp : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_otp, container, false)

        // OTP input fields
        val otpDigit1: EditText = view.findViewById(R.id.otp_digit_1)
        val otpDigit2: EditText = view.findViewById(R.id.otp_digit_2)
        val otpDigit3: EditText = view.findViewById(R.id.otp_digit_3)
        val otpDigit4: EditText = view.findViewById(R.id.otp_digit_4)

        // Set up TextWatchers for OTP input
        otpDigit1.addTextChangedListener(OtpTextWatcher(otpDigit2))
        otpDigit2.addTextChangedListener(OtpTextWatcher(otpDigit3))
        otpDigit3.addTextChangedListener(OtpTextWatcher(otpDigit4))
        otpDigit4.addTextChangedListener(OtpTextWatcher(null) { navigateToSecureLogin() })

        // Handle back arrow navigation
        val backButton = view.findViewById<ImageView>(R.id.back_button)
        backButton.setOnClickListener {
            findNavController().navigate(R.id.action_otpFragment_to_phoneNumberFragment)
        }

        return view
    }

    private fun navigateToSecureLogin() {
        // Navigate to SecureLoginFragment after OTP input
        findNavController().navigate(R.id.action_otpFragment_to_secureLoginFragment)
    }

    inner class OtpTextWatcher(
        private val nextEditText: EditText?,
        private val onComplete: (() -> Unit)? = null
    ) : TextWatcher {
        override fun afterTextChanged(s: Editable?) {
            if (!s.isNullOrEmpty()) {
                nextEditText?.requestFocus()
                if (nextEditText == null) {
                    onComplete?.invoke()
                }
            }
        }

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
    }
}
