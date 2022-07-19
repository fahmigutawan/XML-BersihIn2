package com.frgutawan.xml_bersihin_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import androidx.navigation.findNavController
import com.frgutawan.xml_bersihin_2.databinding.BersihinActivityBinding
import com.frgutawan.xml_bersihin_2.viewmodel.BersihinViewModel
import org.koin.androidx.viewmodel.ext.android.getViewModel

lateinit var hideBottomNavigation: () -> Unit
lateinit var showBottomNavigation: () -> Unit

class BersihinApp : AppCompatActivity() {
    lateinit var binding: BersihinActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /**Some Instantiation*/
        val bersihinViewModel = getViewModel<BersihinViewModel>()

        /**Binding*/
        binding = BersihinActivityBinding.inflate(layoutInflater)
        val view = binding.root

        /**Navigation Layout*/
        val fragmentLayout = binding.bersihinContainerForNavigation

        /**Bottom Navigation*/
        val bottomNavigationView = binding.bottomNavigationBar
        hideBottomNavigation = { bottomNavigationView.isVisible = false }
        showBottomNavigation = { bottomNavigationView.isVisible = true }
        bottomNavigationView.itemIconTintList = null
        bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.bottomnavigation_home_tracking -> {
                    fragmentLayout.findNavController().popBackStack()
                    fragmentLayout.findNavController().navigate(R.id.homeTrackingFragment)
                    true
                }

                R.id.bottomnavigation_home_pickup -> {
                    fragmentLayout.findNavController().popBackStack()
                    fragmentLayout.findNavController().navigate(R.id.homePickupFragment)
                    true
                }

                R.id.bottomnavigation_home_account -> {
                    fragmentLayout.findNavController().popBackStack()
                    fragmentLayout.findNavController().navigate(R.id.homeProfileFragment)
                    true
                }

                else -> false
            }
        }

        /**Set Content View*/
        setContentView(view)
    }
}