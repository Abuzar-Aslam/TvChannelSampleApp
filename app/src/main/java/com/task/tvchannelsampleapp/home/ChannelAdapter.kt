package com.task.tvchannelsampleapp.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.task.tvchannelsampleapp.R
import com.task.tvchannelsampleapp.model.ChannelModel

/**
 * Created by Abuzar on 8/23/2020.
 */

class ChannelAdapter : ListAdapter<ChannelModel, ChannelAdapter.ViewHolder>(DifferentUtil) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_channel, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(channelModel: ChannelModel) {

        }
    }
}

internal object DifferentUtil : DiffUtil.ItemCallback<ChannelModel>() {
    override fun areItemsTheSame(oldItem: ChannelModel, newItem: ChannelModel) = oldItem == newItem

    override fun areContentsTheSame(oldItem: ChannelModel, newItem: ChannelModel): Boolean {
        return false
    }
}