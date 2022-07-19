package com.frgutawan.xml_bersihin_2.data.di

import com.frgutawan.xml_bersihin_2.viewmodel.BersihinViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { BersihinViewModel() }
}