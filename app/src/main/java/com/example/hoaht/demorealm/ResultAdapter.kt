package com.example.hoaht.demorealm

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hoaht.demorealm.model.Person
import kotlinx.android.synthetic.main.item_list_person.view.*

/**
 * ResultAdapter.
 *
 * @author HoaHT
 */
class ResultAdapter(var listPerson: ArrayList<Person>) : RecyclerView.Adapter<ResultAdapter.ResultViewHolder>() {

    override fun onBindViewHolder(holder: ResultViewHolder?, position: Int) {
        holder?.onBind(listPerson[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ResultViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.item_list_person, parent, false)
        return ResultViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listPerson.size
    }

    inner class ResultViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun onBind(person: Person) {
            itemView.tvName.text = person.name
            itemView.tvAge.text = person.age.toString()
        }
    }
}
