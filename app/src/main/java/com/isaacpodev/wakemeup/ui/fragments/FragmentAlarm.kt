package com.isaacpodev.wakemeup.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.isaacpodev.wakemeup.R

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentAlarm.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentAlarm : Fragment() {

    private lateinit var fabButton: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_alarm, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fabButton  = view.findViewById(R.id.faButton)
    }

}