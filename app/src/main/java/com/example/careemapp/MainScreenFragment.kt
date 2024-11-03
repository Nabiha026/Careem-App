package com.example.careemapp

import com.example.careemapp.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import android.widget.ImageView
import android.widget.LinearLayout

class MainScreenFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_main_screen, container, false)
        val menuIcon: ImageView = view.findViewById(R.id.menuButton)
        menuIcon.setOnClickListener {
            // Call openMenu() method from MainActivity
            (activity as? MainActivity)?.openMenu()
        }


        // Set click listener on the Rides icon
        val ridesService: LinearLayout = view.findViewById(R.id.ridesService)
        ridesService.setOnClickListener {
            // Navigate to FragmentMaps when Rides icon is clicked
            findNavController().navigate(R.id.action_fragmentMainScreen_to_fragmentMaps)
        }
        val flexiService: LinearLayout = view.findViewById(R.id.flexiService)
        flexiService.setOnClickListener {
            // Navigate to FragmentMaps when Rides icon is clicked
            findNavController().navigate(R.id.action_fragmentMainScreen_to_fragmentMaps)
        }
        val premiumService: LinearLayout = view.findViewById(R.id.premiumCarService)
        premiumService.setOnClickListener {
            // Navigate to FragmentMaps when Rides icon is clicked
            findNavController().navigate(R.id.action_fragmentMainScreen_to_fragmentMaps)
        }
        val bikeService: LinearLayout = view.findViewById(R.id.bikeService)
        bikeService.setOnClickListener {
            // Navigate to FragmentMaps when Rides icon is clicked
            findNavController().navigate(R.id.action_fragmentMainScreen_to_fragmentMaps)
        }
        val allService: LinearLayout = view.findViewById(R.id.AllService)
        allService.setOnClickListener {
            // Navigate to FragmentMaps when Rides icon is clicked
            findNavController().navigate(R.id.action_fragmentMainScreen_to_fragmentAllServices)
        }
        val clickupService: LinearLayout = view.findViewById(R.id.clickupService)
        clickupService.setOnClickListener {
            // Navigate to FragmentMaps when Rides icon is clicked
            findNavController().navigate(R.id.action_fragmentMainScreen_to_fragmentcredit)
        }
        val cityService: LinearLayout = view.findViewById(R.id.mapService)
        cityService.setOnClickListener {
            // Navigate to FragmentMaps when Rides icon is clicked
            findNavController().navigate(R.id.action_fragmentMainScreen_to_fragmentcity)
        }
        val deliveryService: LinearLayout = view.findViewById(R.id.deliveryService)
        deliveryService.setOnClickListener {
            // Navigate to FragmentMaps when Rides icon is clicked
            findNavController().navigate(R.id.action_fragmentMainScreen_to_fragmentMaps)
        }
        val cardService: LinearLayout = view.findViewById(R.id.card)
        cardService.setOnClickListener {
            // Navigate to FragmentMaps when Rides icon is clicked
            findNavController().navigate(R.id.action_fragmentMainScreen_to_fragmentMaps)
        }
        val card1Service: LinearLayout = view.findViewById(R.id.card1)
        card1Service.setOnClickListener {
            // Navigate to FragmentMaps when Rides icon is clicked
            findNavController().navigate(R.id.action_fragmentMainScreen_to_fragmentMaps)
        }
        val card2Service: LinearLayout = view.findViewById(R.id.card2)
        card2Service.setOnClickListener {
            // Navigate to FragmentMaps when Rides icon is clicked
            findNavController().navigate(R.id.action_fragmentMainScreen_to_fragmentMaps)
        }

        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Find the "I'll do this later" button in the layout
        val doLaterButton = view.findViewById<View>(R.id.payid)

        // Set a click listener to navigate to AllSettingsFragment
        doLaterButton.setOnClickListener {
            // Navigate to AllSettingsFragment using the navigation action
            findNavController().navigate(R.id.action_fragmentMainScreen_to_fragmentpay)
        }
    }


}
