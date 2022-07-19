package com.frgutawan.xml_bersihin_2

import android.app.Application
import com.frgutawan.xml_bersihin_2.data.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

public class MyApplication:Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MyApplication)
            modules(listOf(
                viewModelModule
            ))
        }
    }
}