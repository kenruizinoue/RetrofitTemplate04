package com.kenruizinoue.retrofittemplate04.ui.main

import com.kenruizinoue.retrofittemplate04.data.model.User
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.list_layout.view.*

class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(user: User) {
        itemView.apply {
            userNameTextView.text = user.userName
            userEmailTextView.text = user.userEmail
            Glide.with(avatarImageView.context)
                .load(user.imgUrl)
                .into(avatarImageView)
        }
    }
}