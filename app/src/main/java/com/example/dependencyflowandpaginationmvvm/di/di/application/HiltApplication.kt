package com.example.dependencyflowandpaginationmvvm.di.di.application

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class HiltApplication:Application() {
    override fun onCreate() {
        super.onCreate()
    }
}