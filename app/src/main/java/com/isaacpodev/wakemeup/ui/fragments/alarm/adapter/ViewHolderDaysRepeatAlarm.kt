package com.isaacpodev.wakemeup.ui.fragments.alarm.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.isaacpodev.wakemeup.databinding.DayItemBinding
import com.isaacpodev.wakemeup.models.Alarm
import com.isaacpodev.wakemeup.ui.fragments.alarm.adapter.ViewHolderAlarm.OnItemClickListener

class ViewHolderDaysRepeatAlarm(itemView: View) : ViewHolder(itemView) {
    private val binding = DayItemBinding.bind(itemView)
    private lateinit var mlistener: OnItemClickListener
    fun render(days: List<String>,onItemSelected: (String) -> Unit){
        if(days.size > 1){
            binding.tvDay.text = "${days.first()} a ${days.last()}"
        }else{
            binding.tvDay.text = "${days.first()}"
        }


        itemView.setOnClickListener{
            mlistener.onItemClick(adapterPosition)
        }
    }
}