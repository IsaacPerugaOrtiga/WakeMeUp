package com.isaacpodev.wakemeup.ui.fragments.alarm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.isaacpodev.wakemeup.database.Database
import com.isaacpodev.wakemeup.databinding.FragmentAlarmBinding
import com.isaacpodev.wakemeup.databinding.HourWindowBinding

class FragmentHour : Fragment(){

    private lateinit var binding: HourWindowBinding
    val db = Database

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = HourWindowBinding.inflate(inflater, container, false)
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

        binding.imgSave.setOnClickListener{
            //GUARDAR TODOS LOS PARAMETROS DE LA ALARMA Y GUARDARLA EN LA BASE DE DATOS
        }
    }

    private fun initUI() {


    }


}