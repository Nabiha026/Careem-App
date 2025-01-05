/*
package com.example.careemapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import android.widget.ImageView

class AllSettingsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_all_settings, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Set a click listener for the forward arrow next to "Personal Information"
        val personalInfoForward = view.findViewById<ImageView>(R.id.personal_info_forward)
        personalInfoForward.setOnClickListener {
            // Navigate to the SettingsFragment
            findNavController().navigate(R.id.action_allSettingsFragment_to_settingsFragment)
        }
    }
}
*/
