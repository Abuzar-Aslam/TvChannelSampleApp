package com.task.tvchannelsampleapp.model

/**
 * Created by Abuzar on 8/23/2020.
 */

data class ApiResponse<out T>(val channelModelList: List<ChannelModel>)


data class ChannelModel(
    val id: Int,
    val title: String,
    val mediaCount: String,
    val series: MediaModel,
    val latestMedia: MediaModel,
    val coverAsset: CoverAsset,
    val iconAsset: CoverAsset
)

data class MediaModel(val type: String, val title: String, val coverAsset: CoverAsset)

data class CoverAsset(val url: String)