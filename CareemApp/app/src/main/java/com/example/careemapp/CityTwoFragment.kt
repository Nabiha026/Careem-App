package com.example.careemapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class CityTwoFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_city_two, container, false)

        val cityService1: LinearLayout = view.findViewById(R.id.cityprice)
        cityService1.setOnClickListener {
            // Navigate to FragmentMaps when Rides icon is clicked
            findNavController().navigate(R.id.action_fragmentcitytwo_to_fragmentcitythree)
        }
        val cityService: LinearLayout = view.findViewById(R.id.cityprice1)
        cityService.setOnClickListener {
            // Navigate to FragmentMaps when Rides icon is clicked
            findNavController().navigate(R.id.action_fragmentcitytwo_to_fragmentcitythree)
        }


        return view

    }
}