package com.example.careemapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class AllSetingsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_all_settings, container, false)

        // Set up navigation for each arrow
        view.findViewById<ImageView>(R.id.personal_info_forward).setOnClickListener {
            navigateToFragment(ProfileFragment())
        }

        view.findViewById<ImageView>(R.id.notifications_forward).setOnClickListener {
            navigateToFragment(NotificationFragment())
        }

        view.findViewById<ImageView>(R.id.card_forward).setOnClickListener {
            navigateToFragment(PaymentFragment())
        }

        /*view.findViewById<ImageView>(R.id.saved_addresses_forward).setOnClickListener {
            navigateToFragment(SavedAddressesFragment())
        }*/



       /* view.findViewById<ImageView>(R.id.rewards_forward).setOnClickListener {
            navigateToFragment(RewardsFragment())
        }*/

        view.findViewById<ImageView>(R.id.help_forward).setOnClickListener {
            navigateToFragment(HelpFragment())
        }



        return view
    }

    private fun navigateToFragment(fragment: Fragment) {
        parentFragmentManager.beginTransaction()
            .replace(R.id.nav_host_fragment, fragment)
            .addToBackStack(null)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            .commit()
    }
}
