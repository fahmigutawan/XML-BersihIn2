package com.frgutawan.xml_bersihin_2.screen.home_profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.frgutawan.xml_bersihin_2.databinding.FragmentHomeProfileBinding

class HomeProfileFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentHomeProfileBinding.inflate(inflater, container, false)



        return binding.root
    }
}