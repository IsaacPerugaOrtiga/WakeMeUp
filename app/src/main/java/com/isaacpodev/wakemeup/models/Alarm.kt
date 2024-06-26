package com.isaacpodev.wakemeup.models


import io.realm.kotlin.ext.realmListOf
import io.realm.kotlin.types.RealmList
import io.realm.kotlin.types.RealmObject
import io.realm.kotlin.types.annotations.PrimaryKey
import org.mongodb.kbson.ObjectId

class Alarm(): RealmObject {
    @PrimaryKey
    var _id : ObjectId = ObjectId()
    var alarm: String = ""
    var days: RealmList<String> =  realmListOf()
    var isActivate: Boolean = false
    var owner_id: String = ""
 constructor(ownerId: String = ""): this(){
  owner_id = ownerId
 }

}
