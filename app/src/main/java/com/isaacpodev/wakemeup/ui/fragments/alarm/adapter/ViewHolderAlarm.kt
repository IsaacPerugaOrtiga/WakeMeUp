package com.isaacpodev.wakemeup.ui.fragments.alarm.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.isaacpodev.wakemeup.models.Alarm
import com.isaacpodev.wakemeup.databinding.HourItemBinding

class ViewHolderAlarm(itemView: View) : ViewHolder(itemView) {

    private val binding = HourItemBinding.bind(itemView)
    private lateinit var mlistener: OnItemClickListener
    fun render(alarm: Alarm, onItemSelected: (Alarm) -> Unit){
        binding.tvHour.text = alarm.alarm
        binding.tvDay.text = alarm.days.toString()
        binding.swActivateAlarm.isChecked = alarm.isActivate

        //TODO() MIRAR SI ESTARA BIEN
        itemView.setOnClickListener{
            mlistener.onItemClick(adapterPosition)
        }

    }

    fun setOnItemClickListener(listener:OnItemClickListener){
        mlistener = listener
    }
   interface OnItemClickListener{
       fun onItemClick(position:Int)
   }


}