package com.isaacpodev.wakemeup.ui.fragments.alarm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.isaacpodev.wakemeup.R
import com.isaacpodev.wakemeup.databinding.FragmentAlarmBinding

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentAlarm.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentAlarm : Fragment() {

    private lateinit var fabButton: FloatingActionButton
    private lateinit var binding: FragmentAlarmBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    private fun initListeners(){
        binding.faButton.setOnClickListener(View.OnClickListener {
            it.findNavController().navigate(R.id.action_fragmentAlarm_to_hourActivity)
        })
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAlarmBinding.inflate(inflater, container, false)
        initListeners()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

}