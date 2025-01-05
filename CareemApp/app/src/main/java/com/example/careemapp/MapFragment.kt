package com.example.careemapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class MapFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_map, container, false)


        val payButton = view.findViewById<ImageView>(R.id.mapride)

        // Set a click listener to navigate to AllSettingsFragment
        payButton.setOnClickListener {
            // Navigate to AllSettingsFragment using the navigation action
            findNavController().navigate(R.id.action_fragmentmap_to_fragmentMainScreen)
        }

        return view

    }
}