package com.sayana.myproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DevAdapter(private val developers: List<String>) : RecyclerView.Adapter<DevViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DevViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.dev_list_item, parent, false)
        return DevViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: DevViewHolder, position: Int) {
        val dev = developers[position]
        holder.bind(dev)
    }

    // возвращает общее кол-во элементов списка
    override fun getItemCount(): Int {
        return developers.size
    }
}