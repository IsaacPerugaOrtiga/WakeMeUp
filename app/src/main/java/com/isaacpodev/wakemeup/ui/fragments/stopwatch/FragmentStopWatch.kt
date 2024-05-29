package com.isaacpodev.wakemeup.ui.fragments.stopwatch

import android.os.Bundle
import android.os.SystemClock
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.transition.Visibility
import com.isaacpodev.wakemeup.R
import com.isaacpodev.wakemeup.databinding.FragmentAlarmBinding
import com.isaacpodev.wakemeup.databinding.FragmentStopWatchBinding

class FragmentStopWatch : Fragment() {

    private lateinit var binding: FragmentStopWatchBinding
    private var timeLast: Long = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStopWatchBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
        initListeners()
    }

    private fun initListeners() {

        binding.btnStart.setOnClickListener{
            binding.chronometer.start()
            binding.btnStart.visibility = View.INVISIBLE
            binding.btnRestart.visibility = View.VISIBLE
            binding.btnStop.visibility = View.VISIBLE
        }

        binding.btnRestart.setOnClickListener{
            timeLast = binding.chronometer.base
            binding.chronometer.stop()
            binding.btnRestart.visibility = View.INVISIBLE
            binding.btnStartPause.visibility = View.VISIBLE

        }

        binding.btnStop.setOnClickListener{
            binding.chronometer.base = SystemClock.elapsedRealtime()
            binding.chronometer.stop()
            binding.btnStop.visibility = View.INVISIBLE
            binding.btnRestart.visibility = View.INVISIBLE
            binding.btnStartPause.visibility = View.INVISIBLE
            binding.btnStart.visibility = View.VISIBLE
        }

        binding.btnStartPause.setOnClickListener{
            binding.chronometer.base = timeLast
            binding.btnStartPause.visibility = View.INVISIBLE
            binding.btnRestart.visibility = View.VISIBLE

        }

    }

    private fun initUI() {
        binding.chronometer.base = SystemClock.elapsedRealtime()
    }


}
