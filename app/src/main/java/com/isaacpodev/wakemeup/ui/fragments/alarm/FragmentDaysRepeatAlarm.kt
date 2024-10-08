package com.isaacpodev.wakemeup.ui.fragments.alarm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.isaacpodev.wakemeup.databinding.FragmentDaysRepeatAlarmBinding
import com.isaacpodev.wakemeup.models.Day
import com.isaacpodev.wakemeup.ui.fragments.alarm.adapter.AdapterItemDaysRepeatAlarm

class FragmentDaysRepeatAlarm : Fragment() {

    private lateinit var binding : FragmentDaysRepeatAlarmBinding
    private lateinit var  adapterDaysRepeat: AdapterItemDaysRepeatAlarm
    private var  listDays : ArrayList<Day> = ArrayList<Day>()
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
        initRecyclerView()


    }

    private fun initRecyclerView() {
        listDays.add(Day(daysList = listOf("Lunes", "Martes")))
        listDays.add(Day(daysList = listOf("Sabado", "Domingo")))
        listDays.add(Day(daysList = listOf("Personalizado")))

        adapterDaysRepeat = AdapterItemDaysRepeatAlarm(listDays, onItemSelected = {

        })
        binding.rvDaysRepeat.adapter = adapterDaysRepeat


        binding.rvDaysRepeat.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = adapterDaysRepeat
        }
    }
}