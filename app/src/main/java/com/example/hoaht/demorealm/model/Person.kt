package com.example.hoaht.demorealm.model

import io.realm.RealmModel
import io.realm.annotations.RealmClass

/**
 * Person.
 *
 * @author HoaHT
 */
@RealmClass
class Person() : RealmModel {
    var name: String? = null
    var age: Int = 0

    constructor(name: String, age: Int) : this() {
        this.name = name
        this.age = age
    }
}
