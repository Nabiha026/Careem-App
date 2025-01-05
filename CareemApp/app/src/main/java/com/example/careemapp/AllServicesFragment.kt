package com.example.careemapp

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class AllServicesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_all_services, container, false)

        val rButton = view.findViewById<ImageView>(R.id.ride)

        // Set a click listener to navigate to AllSettingsFragment
        rButton.setOnClickListener {
            // Navigate to AllSettingsFragment using the navigation action
            findNavController().navigate(R.id.action_fragmentallServices_to_fragmentMap)
        }
        val dButton = view.findViewById<ImageView>(R.id.del)

        // Set a click listener to navigate to AllSettingsFragment
        dButton.setOnClickListener {
            // Navigate to AllSettingsFragment using the navigation action
            findNavController().navigate(R.id.action_fragmentallServices_to_fragmentMap)
        }
        val fButton = view.findViewById<ImageView>(R.id.flexi)

        // Set a click listener to navigate to AllSettingsFragment
        fButton.setOnClickListener {
            // Navigate to AllSettingsFragment using the navigation action
            findNavController().navigate(R.id.action_fragmentallServices_to_fragmentMap)
        }
        val bButton = view.findViewById<ImageView>(R.id.bike)

        // Set a click listener to navigate to AllSettingsFragment
        bButton.setOnClickListener {
            // Navigate to AllSettingsFragment using the navigation action
            findNavController().navigate(R.id.action_fragmentallServices_to_fragmentMap)
        }
        val cButton = view.findViewById<ImageView>(R.id.city)

        // Set a click listener to navigate to AllSettingsFragment
        cButton.setOnClickListener {
            // Navigate to AllSettingsFragment using the navigation action
            findNavController().navigate(R.id.action_fragmentallServices_to_fragmentMap)
        }
        val pButton = view.findViewById<ImageView>(R.id.pr)

        // Set a click listener to navigate to AllSettingsFragment
        pButton.setOnClickListener {
            // Navigate to AllSettingsFragment using the navigation action
            findNavController().navigate(R.id.action_fragmentallServices_to_fragmentMap)
        }
        val clButton = view.findViewById<ImageView>(R.id.clickup)

        // Set a click listener to navigate to AllSettingsFragment
        clButton.setOnClickListener {
            // Navigate to AllSettingsFragment using the navigation action
            findNavController().navigate(R.id.action_fragmentallServices_to_fragmentclickup)
        }
        val aButton = view.findViewById<ImageView>(R.id.m1)

        // Set a click listener to navigate to AllSettingsFragment
        aButton.setOnClickListener {
            // Navigate to AllSettingsFragment using the navigation action
            findNavController().navigate(R.id.action_fragmentallServices_to_fragmentamount)
        }
        val aaButton = view.findViewById<ImageView>(R.id.m2)

        // Set a click listener to navigate to AllSettingsFragment
        aaButton.setOnClickListener {
            // Navigate to AllSettingsFragment using the navigation action
            findNavController().navigate(R.id.action_fragmentallServices_to_fragmentamount)
        }

        val aaaButton = view.findViewById<ImageView>(R.id.backIcon)

        // Set a click listener to navigate to AllSettingsFragment
        aaaButton.setOnClickListener {
            // Navigate to AllSettingsFragment using the navigation action
            findNavController().navigate(R.id.action_fragmentallServices_to_fragmentMainScreen)
        }
        return view



    }


}
