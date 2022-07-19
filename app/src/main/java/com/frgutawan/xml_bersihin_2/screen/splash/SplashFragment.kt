package com.frgutawan.xml_bersihin_2.screen.splash

import android.content.Context
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.frgutawan.xml_bersihin_2.R
import com.frgutawan.xml_bersihin_2.hideBottomNavigation

class SplashFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        /**Disabling Bottom Navigation*/
        hideBottomNavigation()

        Handler().postDelayed({
            if (onBoardingFinished()) {
                findNavController().popBackStack()
                findNavController().navigate(R.id.homeTrackingFragment)
            }
            else {
                findNavController().popBackStack()
                findNavController().navigate(R.id.viewPagerFragment)
            }
        },2000)

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    private fun onBoardingFinished(): Boolean {
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        return sharedPref.getBoolean("Finished",false)
    }
}