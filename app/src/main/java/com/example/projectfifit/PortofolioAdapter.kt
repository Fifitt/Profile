package com.example.projectfifit

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintSet.Layout
import androidx.recyclerview.widget.RecyclerView

class PortofolioAdapter(private val list: ArrayList<PortofolioData>):
    RecyclerView.Adapter<PortofolioAdapter.Portofolioviewhoder>(){

    class Portofolioviewhoder(itemview: View): RecyclerView.ViewHolder(itemview) {
        private val logo = itemview.findViewById<ImageView>(R.id.logoPortofolio)
        private val judul = itemview.findViewById<TextView>(R.id.judulPortofolio)
        private val desc = itemview.findViewById<TextView>(R.id.deskripsiPortofolio)

        fun bind(get : PortofolioData){
            logo.setImageResource(get.logo)
            judul.text = get.judul
            desc.text = get.desc

            judul.setOnClickListener{
                val open = Intent(Intent.ACTION_VIEW, Uri.parse(get.url))
                itemView.context.startActivity(open)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Portofolioviewhoder {
        return Portofolioviewhoder(LayoutInflater.from(parent.context)
            .inflate(R.layout.portofolio_list,parent,false))
    }

    override fun getItemCount(): Int {
       return list.size
    }

    override fun onBindViewHolder(holder: Portofolioviewhoder, position: Int) {
        holder.bind(list[position])
    }
}