package com.example.hoaht.demorealm

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.hoaht.demorealm.model.Person
import io.realm.Realm
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var realm: Realm? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Realm.init(this)
        realm = Realm.getDefaultInstance()

        btnAdd.setOnClickListener {
            val name = edtName.text.toString()
            val age = edtAge.text.toString().toInt()
            realm?.beginTransaction()
            val person: Person = realm?.createObject(Person::class.java)!!
            person.name = name
            person.age = age
            realm?.commitTransaction()
        }

        btnResult.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
        }
    }
}
