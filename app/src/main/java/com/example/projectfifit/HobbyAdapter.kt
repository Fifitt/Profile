package com.example.projectfifit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HobbyAdapter(private var list: ArrayList<HobbyData>):
    RecyclerView.Adapter<HobbyAdapter.HobbyViewHolder>() {

    class HobbyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val nama = itemView.findViewById<TextView>(R.id.namaHobby)
        private val desc = itemView.findViewById<TextView>(R.id.descHobby)

        fun bind(get: HobbyData) {
            nama.text = get.nama
            desc.text = get.desc
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HobbyViewHolder {
        return HobbyAdapter.HobbyViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.hobby_list, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: HobbyViewHolder, position: Int) {
        holder.bind(list[position])
    }
}

