package com.isaacpodev.wakemeup.database

import com.isaacpodev.wakemeup.models.Alarm
import io.realm.kotlin.Realm
import io.realm.kotlin.RealmConfiguration
import io.realm.kotlin.ext.query
import io.realm.kotlin.types.RealmList

object Database {
    val config = RealmConfiguration.create(schema = setOf(Alarm::class))
    val realm = Realm.open(config)

    suspend fun writeAlarm(alarmUser: String,daysUser: RealmList<String>,isActivateUser: Boolean){
        realm.write {
            val objectAlarm = Alarm().apply {
                alarm = alarmUser
                days = daysUser
                isActivate = isActivateUser
            }
            val managedAlarm = copyToRealm(objectAlarm)
        }
    }

    suspend fun updateAlarm(id:Int,alarmUser: String,daysUser: RealmList<String>,isActivateUser: Boolean){
        realm.write {
            var selectAlarm = realm.query<Alarm>("id == $id",id).find().first()

            val updateAlarm = Alarm().apply {
                alarm = alarmUser
                days = daysUser
                isActivate = isActivateUser
            }
            selectAlarm = updateAlarm
        }
    }

    suspend fun deleteAlarm(id:Int){
        realm.write {
            val alarmToDelete = query<Alarm>("id == $id",id).find().first()
            delete(alarmToDelete)
        }
    }

    suspend fun readAlarm(id:Int,alarmUser: String,daysUser: RealmList<String>,isActivateUser: Boolean){
        realm.query<Alarm>().find()
    }
}