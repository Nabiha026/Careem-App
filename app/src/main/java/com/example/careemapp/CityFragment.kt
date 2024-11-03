package com.example.careemapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class CityFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_city, container, false)

        val cityService1: LinearLayout = view.findViewById(R.id.city1)
        cityService1.setOnClickListener {
            // Navigate to FragmentMaps when Rides icon is clicked
            findNavController().navigate(R.id.action_fragmentMainScreen_to_fragmentcityone)
        }
        val cityService2: LinearLayout = view.findViewById(R.id.city2)
        cityService2.setOnClickListener {
            // Navigate to FragmentMaps when Rides icon is clicked
            findNavController().navigate(R.id.action_fragmentMainScreen_to_fragmentcityone)
        }
        val cityService3: LinearLayout = view.findViewById(R.id.city3)
        cityService3.setOnClickListener {
            // Navigate to FragmentMaps when Rides icon is clicked
            findNavController().navigate(R.id.action_fragmentMainScreen_to_fragmentcityone)
        }


        return view

    }
}