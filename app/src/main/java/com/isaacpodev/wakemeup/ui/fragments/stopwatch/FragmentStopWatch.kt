package com.isaacpodev.wakemeup.ui.fragments.stopwatch

import android.os.Bundle
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
        binding.faButtonStart.setOnClickListener{
            binding.faButtonStart.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.pause_button))
            binding.chronometer.start()
            binding.faButtonStop.visibility = View.VISIBLE

        }

        binding.faButtonStop.setOnClickListener { binding.chronometer.stop()
            binding.chronometer.text = "00:00"
            binding.chronometer.stop()
        }
    }

    private fun initUI() {

    }


}