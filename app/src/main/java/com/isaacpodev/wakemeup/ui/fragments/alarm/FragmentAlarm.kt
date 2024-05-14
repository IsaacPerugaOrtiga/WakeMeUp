package com.isaacpodev.wakemeup.ui.fragments.alarm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.isaacpodev.wakemeup.models.Alarm
import com.isaacpodev.wakemeup.R
import com.isaacpodev.wakemeup.databinding.FragmentAlarmBinding
import com.isaacpodev.wakemeup.ui.fragments.alarm.adapter.AdapterItemAlarm
import com.isaacpodev.wakemeup.utils.Const

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentAlarm.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentAlarm : Fragment() {

    private var listAlarms : ArrayList<Alarm> = ArrayList<Alarm>()
    private lateinit var binding: FragmentAlarmBinding
    private lateinit var alarm: Alarm

    private fun initListeners(){
        binding.faButton.setOnClickListener(View.OnClickListener {
            it.findNavController().navigate(R.id.action_fragmentAlarm_to_fragmentHour)
        })
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAlarmBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
        initListeners()

    }

    private fun initUI() {
        val adapterAlarm = AdapterItemAlarm(listAlarms){
            Const().checkedAlarm = it.isActivate
            Const().hour = it.alarm
            //Const().days = it.days
            findNavController().navigate(R.id.action_fragmentAlarm_to_fragmentHour)

        }
        binding.rvHours.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = adapterAlarm
        }
    }

}