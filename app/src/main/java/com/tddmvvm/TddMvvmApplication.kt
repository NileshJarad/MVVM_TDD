package com.tddmvvm

import android.app.Application
import com.tddmvvm.data.dataModule
import com.tddmvvm.di.uiModule
import com.tddmvvm.domain.di.domainModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class TddMvvmApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            modules(listOf(dataModule, domainModule, uiModule))
            androidContext(applicationContext)
        }
    }
}