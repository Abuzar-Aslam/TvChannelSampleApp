package com.task.tvchannelsampleapp.interactors

import android.util.Log
import com.task.tvchannelsampleapp.model.ApiResponse
import io.reactivex.observers.DisposableObserver

/**
 * Created by Abuzar on 8/22/2020.
 */

abstract class BaseUseCaseSubscriber<T>() : DisposableObserver<ApiResponse<T>>() {

    override fun onComplete() {

        Log.d("Abuzar", "onComplete")
    }

    override fun onNext(t: ApiResponse<T>) {


        Log.d("Abuzar", "onNext")
        if (t.channelModelList == null || t.channelModelList.isEmpty()) {
            onFail("error")
        } else onSuccess(t)
    }

    override fun onError(e: Throwable) {
//        TODO("Not yet implemented")

        Log.d("Abuzar", "on Error " + e.message)
    }

    abstract fun onSuccess(t: ApiResponse<T>)

    abstract fun onFail(errorMessage: String?)

}