package com.frgutawan.xml_bersihin_2.screen.home_tracking

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.frgutawan.xml_bersihin_2.R
import com.frgutawan.xml_bersihin_2.databinding.FragmentHistoryBinding
import com.frgutawan.xml_bersihin_2.databinding.FragmentHomeTrackingBinding
import com.frgutawan.xml_bersihin_2.showBottomNavigation

class HomeTrackingFragment : Fragment() {
    lateinit var binding:FragmentHomeTrackingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        /**UnHiding Bottom Navigation*/
        showBottomNavigation()
        binding = FragmentHomeTrackingBinding.inflate(inflater, container, false)

        binding.btnHistory.setOnClickListener {
            findNavController().navigate(R.id.historyFragment)
        }

        // Inflate the layout for this fragment
        return binding.root
    }

}