package com.task.tvchannelsampleapp.home

import androidx.lifecycle.ViewModel
import com.task.tvchannelsampleapp.data.TvApi
import com.task.tvchannelsampleapp.home.episode.EpisodeSubscriber
import com.task.tvchannelsampleapp.interactors.EpisodeUseCase

/**
 * Created by Abuzar on 8/22/2020.
 */

class ChannelHomeViewModel(private val tvApi: TvApi) : ViewModel() {


    fun fetchEpisodes() {
        EpisodeUseCase(tvApi).execute(EpisodeSubscriber())
    }


}