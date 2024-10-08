package com.isaacpodev.wakemeup.ui.fragments.alarm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.isaacpodev.wakemeup.R
import com.isaacpodev.wakemeup.database.Database
import com.isaacpodev.wakemeup.databinding.HourWindowBinding
import io.realm.kotlin.ext.realmListOf
import io.realm.kotlin.types.RealmList
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

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

    @OptIn(DelicateCoroutinesApi::class)
    private fun initListeners() {
        binding.imgBack.setOnClickListener{
            it.findNavController().popBackStack()
        }

        binding.imgSave.setOnClickListener{
            val daysUser: RealmList<String> = realmListOf()
            daysUser.add("Lunes")
            GlobalScope.launch {
                db.writeAlarm(
                    alarmUser = binding.timePicker.toString(),
                    daysUser = daysUser,
                    isActivateUser = true
                )
            }
        }

        binding.tvDays.setOnClickListener{
            it.findNavController().navigate(R.id.action_fragmentHour_to_fragmentDaysRepeatAlarm)
        }
    }

    private fun initUI() {
        binding.tvDays.text = ""

    }


}