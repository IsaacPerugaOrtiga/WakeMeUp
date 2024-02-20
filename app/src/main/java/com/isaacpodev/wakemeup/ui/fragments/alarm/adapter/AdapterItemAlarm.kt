package com.isaacpodev.wakemeup.ui.fragments.alarm.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.isaacpodev.models.Alarm
import com.isaacpodev.wakemeup.R

class AdapterItemAlarm(private val alarmList: ArrayList<Alarm>,
                       private val onItemSelected:(Alarm) -> Unit): RecyclerView.Adapter<ViewHolderAlarm>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderAlarm {
    return ViewHolderAlarm( LayoutInflater.from(parent.context)
           .inflate(R.layout.hour_item,null))
    }

    override fun getItemCount(): Int{
        return alarmList.count()
    }

    override fun onBindViewHolder(holder: ViewHolderAlarm, position: Int) {
        holder.render(alarmList[position],onItemSelected)
    }
}