package com.frgutawan.xml_bersihin_2.screen.home_pickup

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import com.frgutawan.xml_bersihin_2.MyApplication
import com.frgutawan.xml_bersihin_2.databinding.FragmentHomePickupBinding
import com.frgutawan.xml_bersihin_2.showBottomNavigation

class HomePickupFragment:Fragment() {
    lateinit var binding:FragmentHomePickupBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomePickupBinding.inflate(inflater, container, false)

        /**UnHiding bottom navigation*/
        showBottomNavigation()

        return binding.root
    }
}