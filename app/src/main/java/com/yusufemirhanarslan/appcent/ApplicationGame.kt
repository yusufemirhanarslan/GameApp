package com.yusufemirhanarslan.appcent

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class ApplicationGame : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}
