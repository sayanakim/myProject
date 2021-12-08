package com.sayana.myproject

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DevViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {

    private val devAboutTextView: TextView =
        itemView.findViewById(R.id.dev_about_text_view)

    fun bind(name: String) {
        devAboutTextView.text = name
    }
}