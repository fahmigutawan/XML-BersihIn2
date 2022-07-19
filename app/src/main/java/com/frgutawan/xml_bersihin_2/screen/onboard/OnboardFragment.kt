package com.frgutawan.xml_bersihin_2.screen.onboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.frgutawan.xml_bersihin_2.databinding.FragmentOnboardBinding
import com.frgutawan.xml_bersihin_2.hideBottomNavigation
import com.playbox.bersihin.ui.onboard.screens.FirstScreenFragment
import com.playbox.bersihin.ui.onboard.screens.SecondScreenFragment
import com.playbox.bersihin.ui.onboard.screens.ThirdScreenFragment


class OnboardFragment : Fragment() {

    private var _binding: FragmentOnboardBinding? = null
    private val binding: FragmentOnboardBinding? get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentOnboardBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        /**Disabling Bottom Navigation*/
        hideBottomNavigation()

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