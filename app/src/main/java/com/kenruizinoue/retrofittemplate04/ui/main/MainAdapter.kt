package com.kenruizinoue.retrofittemplate04.ui.main

import com.kenruizinoue.retrofittemplate04.R
import com.kenruizinoue.retrofittemplate04.data.model.User
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MainAdapter(private val users: ArrayList<User>) : RecyclerView.Adapter<DataViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder =
        DataViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.list_layout, parent, false)
        )

    override fun getItemCount(): Int = users.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(users[position])
    }

    fun addUsers(users: List<User>) {
        this.users.apply {
            clear()
            addAll(users)
        }
    }

}