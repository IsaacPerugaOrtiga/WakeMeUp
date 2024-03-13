package com.isaacpodev.wakemeup.database

import com.isaacpodev.wakemeup.models.Alarm
import io.realm.kotlin.Realm
import io.realm.kotlin.RealmConfiguration

object Database {
    val config = RealmConfiguration.create(schema = setOf(Alarm::class))
    val realm = Realm.open(config)
}