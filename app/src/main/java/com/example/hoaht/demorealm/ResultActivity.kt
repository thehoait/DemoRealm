package com.example.hoaht.demorealm

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.example.hoaht.demorealm.model.Person
import io.realm.Realm
import kotlinx.android.synthetic.main.activity_result.*

/**
 * ResultActivity.
 *
 * @author HoaHT
 */
class ResultActivity : AppCompatActivity() {
    private val listPerson = ArrayList<Person>()
    private var realm: Realm? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        realm = Realm.getDefaultInstance()
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = ResultAdapter(listPerson)
        recyclerView.adapter = adapter

        initData()
    }

    private fun initData() {
        val result = realm?.where(Person::class.java)?.findAll()
    }
}
