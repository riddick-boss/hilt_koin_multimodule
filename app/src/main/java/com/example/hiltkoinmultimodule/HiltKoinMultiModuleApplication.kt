package com.example.hiltkoinmultimodule

import android.app.Application
import com.example.koin.di.koinModule
import dagger.hilt.android.HiltAndroidApp
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

@HiltAndroidApp
class HiltKoinMultiModuleApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@HiltKoinMultiModuleApplication)
            modules(koinModule)
        }
    }
}