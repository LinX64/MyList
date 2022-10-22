package com.example.mylist

import android.app.Application
import com.example.mylist.di.appModule
import com.example.mylist.di.useCaseModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        initKoin()
    }

    private fun initKoin() {
        startKoin {
            androidContext(this@App)
            modules(listOf(appModule, useCaseModule))
        }
    }
}