package com.task.tvchannelsampleapp.interactors

import com.task.tvchannelsampleapp.data.TvApi
import com.task.tvchannelsampleapp.model.ApiResponse
import com.task.tvchannelsampleapp.model.ChannelModel
import io.reactivex.Observable

/**
 * Created by Abuzar on 8/23/2020.
 */

class EpisodeUseCase(private val tvApi: TvApi) : BaseUseCase<ApiResponse<ChannelModel>>() {

    override fun buildUseCaseObservable(): Observable<ApiResponse<ChannelModel>> {

        return tvApi.fetchEpisode()
    }

}