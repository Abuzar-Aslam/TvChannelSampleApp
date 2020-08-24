package com.task.tvchannelsampleapp.base

import android.app.Application
import androidx.multidex.MultiDexApplication
import com.task.tvchannelsampleapp.injection.appModule
import com.task.tvchannelsampleapp.injection.dataModule
import org.koin.android.ext.android.startKoin

/**
 * Created by Abuzar on 8/22/2020.
 */

class BaseApplication : MultiDexApplication() {


    override fun onCreate() {
        super.onCreate()
        startKoin(androidContext = this, modules = listOf(appModule, dataModule))
    }

}