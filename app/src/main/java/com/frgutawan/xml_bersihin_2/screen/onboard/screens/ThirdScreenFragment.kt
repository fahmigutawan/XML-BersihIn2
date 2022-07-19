package com.frgutawan.xml_bersihin_2.screen.onboard.screens

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.frgutawan.xml_bersihin_2.R
import com.frgutawan.xml_bersihin_2.databinding.FragmentOnboardScr3Binding

class ThirdScreenFragment : Fragment() {

    private var _binding: FragmentOnboardScr3Binding? = null
    private val binding: FragmentOnboardScr3Binding? get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOnboardScr3Binding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.btnFinish?.setOnClickListener {
            findNavController().navigate(R.id.homeTrackingFragment)
            onBoardingFinished()
            findNavController().popBackStack()
        }
    }

    private fun onBoardingFinished(){
        val sharedPref = requireActivity().getSharedPreferences("onBoarding",Context.MODE_PRIVATE)
        val editor  = sharedPref.edit()
        editor.putBoolean("Finished",true)
        editor.apply()
    }

}