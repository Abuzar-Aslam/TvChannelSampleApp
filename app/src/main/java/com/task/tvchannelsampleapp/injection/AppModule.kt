package com.task.tvchannelsampleapp.injection

import com.task.tvchannelsampleapp.R
import com.task.tvchannelsampleapp.data.TvApi
import com.task.tvchannelsampleapp.home.ChannelHomeViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Abuzar on 8/22/2020.
 */

val appModule = module {

    single {
        ChannelHomeViewModel(get())
    }

}

val dataModule = module {


    single {
        val retrofit = Retrofit.Builder()
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://pastebin.com/")
            .build()

        retrofit.create(TvApi::class.java)

    }

}