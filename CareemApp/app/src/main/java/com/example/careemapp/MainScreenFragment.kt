package com.example.careemapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class MainScreenFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_main_screen, container, false)

        // Menu button
        val menuIcon: ImageView = view.findViewById(R.id.menuButton)
        menuIcon.setOnClickListener {
            (activity as? MainActivity)?.openMenu()
        }

        // Set click listeners for services
        val ridesService: LinearLayout = view.findViewById(R.id.ridesService)
        ridesService.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentMainScreen_to_fragmentMaps)
        }

        val flexiService: LinearLayout = view.findViewById(R.id.flexiService)
        flexiService.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentMainScreen_to_fragmentMaps)
        }

        val premiumService: LinearLayout = view.findViewById(R.id.premiumCarService)
        premiumService.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentMainScreen_to_fragmentMaps)
        }

        val bikeService: LinearLayout = view.findViewById(R.id.bikeService)
        bikeService.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentMainScreen_to_fragmentMaps)
        }

        val allService: LinearLayout = view.findViewById(R.id.AllService)
        allService.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentMainScreen_to_fragmentAllServices)
        }

        val clickupService: LinearLayout = view.findViewById(R.id.clickupService)
        clickupService.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentMainScreen_to_fragmentcredit)
        }

        val cityService: LinearLayout = view.findViewById(R.id.mapService)
        cityService.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentMainScreen_to_fragmentcity)
        }

        val deliveryService: LinearLayout = view.findViewById(R.id.deliveryService)
        deliveryService.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentMainScreen_to_fragmentMaps)
        }

        val cardService: LinearLayout = view.findViewById(R.id.card)
        cardService.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentMainScreen_to_fragmentMaps)
        }

        val card1Service: LinearLayout = view.findViewById(R.id.card1)
        card1Service.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentMainScreen_to_fragmentMaps)
        }

        val card2Service: LinearLayout = view.findViewById(R.id.card2)
        card2Service.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentMainScreen_to_fragmentMaps)
        }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Find the "I'll do this later" button in the layout
        val doLaterButton = view.findViewById<View>(R.id.payid)

        // Set a click listener to navigate to the payment fragment
        doLaterButton.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentMainScreen_to_fragmentpay)
        }

        // Override the back button behavior to close the app
//        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, object : OnBackPressedCallback(true) {
//            override fun handleOnBackPressed() {
//                // Exit the app
//                requireActivity().finish()
//            }
//        })
    }
}
