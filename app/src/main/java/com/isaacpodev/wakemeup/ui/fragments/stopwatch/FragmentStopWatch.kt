package com.isaacpodev.wakemeup.ui.fragments.stopwatch

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.isaacpodev.wakemeup.R
import com.isaacpodev.wakemeup.databinding.FragmentAlarmBinding
import com.isaacpodev.wakemeup.databinding.FragmentStopWatchBinding

class FragmentStopWatch : Fragment() {

    private lateinit var binding: FragmentStopWatchBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_stop_watch, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}