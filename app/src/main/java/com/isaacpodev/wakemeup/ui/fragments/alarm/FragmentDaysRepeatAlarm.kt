package com.isaacpodev.wakemeup.ui.fragments.alarm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.isaacpodev.wakemeup.databinding.FragmentDaysRepeatAlarmBinding
import com.isaacpodev.wakemeup.ui.fragments.alarm.adapter.AdapterItemDaysRepeatAlarm

class FragmentDaysRepeatAlarm : Fragment() {

    private lateinit var binding : FragmentDaysRepeatAlarmBinding
    private lateinit var  adapterDaysRepeat: AdapterItemDaysRepeatAlarm
    private var  listDays : ArrayList<String> = ArrayList<String>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDaysRepeatAlarmBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
        initListeners()

    }

    private fun initListeners() {
        binding.imgBack.setOnClickListener{
            it.findNavController().popBackStack()
        }


    }

    private fun initUI() {
        initList()
    }

    private fun initList() {
        listDays.add("Lunes a Vierens")
        listDays.add("Sabado a Domingo")
        listDays.add("Personalizado")

        adapterDaysRepeat = AdapterItemDaysRepeatAlarm(listDays, onItemSelected = {

        })
        binding.rvDaysRepeat.adapter = adapterDaysRepeat


        binding.rvDaysRepeat.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = adapterDaysRepeat
        }
    }
}