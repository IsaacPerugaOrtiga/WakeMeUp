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
    private var isPaused: Boolean = false
    private var pauseOffset: Long = 0



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
        initListeners()
    }

    private fun initListeners() {
        binding.btnStart.setOnClickListener{
            binding.chronometer.base = SystemClock.elapsedRealtime() - pauseOffset
            binding.chronometer.start()
            binding.btnStart.visibility = View.INVISIBLE
            binding.btnStartPause.visibility = View.VISIBLE
            binding.btnStop.visibility = View.VISIBLE
            isPaused = false
        }

        binding.btnStop.setOnClickListener{
            binding.chronometer.base = SystemClock.elapsedRealtime()
            pauseOffset = 0
            binding.chronometer.stop()
            binding.btnStop.visibility = View.INVISIBLE
            binding.btnStartPause.visibility = View.INVISIBLE
            binding.btnStart.visibility = View.VISIBLE
            isPaused = false
        }

        binding.btnStartPause.setOnClickListener{
            if (isPaused) {
                binding.btnStartPause.setImageResource(R.drawable.pause_button)
                binding.chronometer.base = SystemClock.elapsedRealtime() - pauseOffset
                binding.chronometer.start()
                isPaused = false
            } else {
                binding.btnStartPause.setImageResource(R.drawable.start_button)
                pauseOffset = SystemClock.elapsedRealtime() - binding.chronometer.base
                binding.chronometer.stop()
                isPaused = true
            }
        }
    }

    private fun initUI() {
        binding.chronometer.base = SystemClock.elapsedRealtime()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentStopWatchBinding.inflate(inflater, container, false)
        return binding.root
    }
}
