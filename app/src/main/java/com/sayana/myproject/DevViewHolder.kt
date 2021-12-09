package com.sayana.myproject

import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DevViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {

    private val nameTextView: TextView =
        itemView.findViewById(R.id.name_text_view)
//    private val devButton: Button =
//        itemView.findViewById(R.id.dev_button)

    fun bind(name: String) {
        nameTextView.text = name
    }

}