package com.isaacpodev.wakemeup.ui.fragments.alarm.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.isaacpodev.wakemeup.R

class AdapterItemDaysRepeatAlarm(private val days: List<String>,
                                 private val onItemSelected: (String) -> Unit): RecyclerView.Adapter<ViewHolderDaysRepeatAlarm>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderDaysRepeatAlarm {
        return ViewHolderDaysRepeatAlarm( LayoutInflater.from(parent.context)
            .inflate(R.layout.day_item,parent,false))
    }

    override fun getItemCount(): Int {
        return days.size
    }

    override fun onBindViewHolder(holder: ViewHolderDaysRepeatAlarm, position: Int) {
        holder.render(days[position],onItemSelected)
    }

}