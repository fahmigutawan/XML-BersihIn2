package com.frgutawan.xml_bersihin_2.screen.onboard.screens

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.frgutawan.xml_bersihin_2.R
import com.frgutawan.xml_bersihin_2.databinding.FragmentOnboardScr2Binding

class SecondScreenFragment : Fragment() {

    private var _binding: FragmentOnboardScr2Binding? = null
    private val binding: FragmentOnboardScr2Binding? get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOnboardScr2Binding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        binding?.btnNext?.setOnClickListener {
            viewPager?.currentItem=2
        }

        binding?.tvSkipOnboard?.setOnClickListener {
            onBoardingFinished()
            findNavController().navigate(R.id.homeTrackingFragment)
            findNavController().popBackStack()
        }
    }

    private fun onBoardingFinished(){
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor  = sharedPref.edit()
        editor.putBoolean("Finished",true)
        editor.apply()
    }
}