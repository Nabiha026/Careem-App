package com.example.careemapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class PaymentFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_payment, container, false)

        // Set click listener on the Rides icon

        val pButton = view.findViewById<Button>(R.id.add_funds_button)

        // Set a click listener to navigate to AllSettingsFragment
        pButton.setOnClickListener {
            // Navigate to AllSettingsFragment using the navigation action
            findNavController().navigate(R.id.action_fragmentpayment_to_fragmentamount)
        }


        return view

    }
}