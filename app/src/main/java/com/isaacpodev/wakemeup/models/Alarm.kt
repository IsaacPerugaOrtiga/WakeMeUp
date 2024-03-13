package com.isaacpodev.wakemeup.models


import io.realm.kotlin.types.RealmObject
import io.realm.kotlin.types.annotations.PrimaryKey
import org.mongodb.kbson.ObjectId

class Alarm(): RealmObject {
    @PrimaryKey
    var _id : ObjectId = ObjectId()
    val alarm: String = ""
    val days: ArrayList<String> = ArrayList()
    val isActivate: Boolean = false
    var owner_id: String = ""
 constructor(ownerId: String = ""): this(){
  owner_id = ownerId
 }

}
