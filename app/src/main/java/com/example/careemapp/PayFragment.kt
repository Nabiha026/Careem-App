package com.example.careemapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class PayFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_pay, container, false)

        // Set click listener on the Rides icon


        return view

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Find the "I'll do this later" button in the layout
        val doLaterButton = view.findViewById<Button>(R.id.sendCreditButton)

        // Set a click listener to navigate to AllSettingsFragment
        doLaterButton.setOnClickListener {
            // Navigate to AllSettingsFragment using the navigation action
            findNavController().navigate(R.id.action_fragmentpay_to_fragmentamount)
        }
        val requestButton = view.findViewById<Button>(R.id.requestCreditButton)

        // Set a click listener to navigate to AllSettingsFragment
        requestButton.setOnClickListener {
            // Navigate to AllSettingsFragment using the navigation action
            findNavController().navigate(R.id.action_fragmentpay_to_fragmentamount)
        }
        val manageButton = view.findViewById<TextView>(R.id.manage)

        // Set a click listener to navigate to AllSettingsFragment
        manageButton.setOnClickListener {
            // Navigate to AllSettingsFragment using the navigation action
            findNavController().navigate(R.id.action_fragmentpay_to_fragmentpayment)
        }
    }
}