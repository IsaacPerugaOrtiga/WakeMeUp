package com.isaacpodev.wakemeup.ui.fragments.alarm.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.isaacpodev.wakemeup.databinding.DayItemBinding
import com.isaacpodev.wakemeup.models.Alarm
import com.isaacpodev.wakemeup.ui.fragments.alarm.adapter.ViewHolderAlarm.OnItemClickListener

class ViewHolderDaysRepeatAlarm(itemView: View) : ViewHolder(itemView) {
    private val binding = DayItemBinding.bind(itemView)
    private lateinit var mlistener: OnItemClickListener
    fun render(days: String,onItemSelected: (String) -> Unit){
        binding.tvDay.text = days

        itemView.setOnClickListener{
            mlistener.onItemClick(adapterPosition)
        }
    }
}