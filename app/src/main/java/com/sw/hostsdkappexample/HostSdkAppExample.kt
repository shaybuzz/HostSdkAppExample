package com.sw.hostsdkappexample

import android.app.Application
import com.malshinun_crashes.MalshinunCrashes

class HostSdkAppExample : Application() {
    override fun onCreate() {
        super.onCreate()
        MalshinunCrashes(this)
    }
}