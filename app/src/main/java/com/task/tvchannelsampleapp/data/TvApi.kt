package com.task.tvchannelsampleapp.data

import com.task.tvchannelsampleapp.model.ApiResponse
import com.task.tvchannelsampleapp.model.ChannelModel
import io.reactivex.Observable
import retrofit2.http.GET

/**
 * Created by Abuzar on 8/23/2020.
 */

interface TvApi {

    @GET("raw/z5AExTtw")
    fun fetchEpisode(): Observable<ApiResponse<ChannelModel>>

}