package com.task.tvchannelsampleapp.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.task.tvchannelsampleapp.R
import org.koin.android.viewmodel.ext.android.viewModel

class ChannelHomeActivity : AppCompatActivity() {

    private val channelHomeViewModel: ChannelHomeViewModel by viewModel()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        channelHomeViewModel.fetchEpisodes()
    }
}
