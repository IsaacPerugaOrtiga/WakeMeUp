package com.isaacpodev.wakemeup.ui.fragments.alarm.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.isaacpodev.models.Alarm
import com.isaacpodev.wakemeup.databinding.HourItemBinding

class ViewHolderAlarm(itemView: View,listener: onItemClickListener) : ViewHolder(itemView) {

    private val binding = HourItemBinding.bind(itemView)
    private lateinit var mlistener: onItemClickListener
    fun render(alarm: Alarm,onItemSelected: (Alarm) -> Unit){
        binding.tvHour.text = alarm.alarm
        binding.tvDay.text = alarm.days.toString()
        binding.swActivateAlarm.isChecked = alarm.isActivate

        //TODO() MIRAR SI ESTARA BIEN
        itemView.setOnClickListener{
            mlistener.onItemClick(adapterPosition)
        }

    }

    fun setOnItemClickListener(listener:onItemClickListener){
        mlistener = listener
    }
   interface onItemClickListener{
       fun onItemClick(position:Int)
   }


}