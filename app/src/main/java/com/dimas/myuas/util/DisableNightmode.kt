package com.dimas.util

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class DisableNightmode : Application() {
    override fun onCreate() {
        super.onCreate()
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
    }
}