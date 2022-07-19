package com.frgutawan.xml_bersihin_2.screen.onboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.frgutawan.xml_bersihin_2.R
import com.frgutawan.xml_bersihin_2.databinding.FragmentViewPagerBinding
import com.frgutawan.xml_bersihin_2.screen.onboard.screens.FirstScreenFragment
import com.frgutawan.xml_bersihin_2.screen.onboard.screens.SecondScreenFragment
import com.frgutawan.xml_bersihin_2.screen.onboard.screens.ThirdScreenFragment

class ViewPagerFragment : Fragment() {

    private var _binding: FragmentViewPagerBinding? = null
    private val binding: FragmentViewPagerBinding? get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentViewPagerBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listOfFragment = arrayListOf(
            FirstScreenFragment(),
            SecondScreenFragment(),
            ThirdScreenFragment(),
        )

        val adapter = ViewPagerAdapter(
            listOfFragment,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        binding?.viewPager?.adapter = adapter

    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

}