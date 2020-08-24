package com.task.tvchannelsampleapp.home.episode

import com.task.tvchannelsampleapp.interactors.BaseUseCaseSubscriber
import com.task.tvchannelsampleapp.model.ApiResponse
import com.task.tvchannelsampleapp.model.ChannelModel

/**
 * Created by Abuzar on 8/23/2020.
 */

class EpisodeSubscriber() : BaseUseCaseSubscriber<ChannelModel>() {


    override fun onSuccess(t: ApiResponse<ChannelModel>) {

    }

    override fun onFail(errorMessage: String?) {
        TODO("Not yet implemented")
    }


}