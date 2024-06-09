package com.example.firebase.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.firebase.R
import com.example.firebase.model.StadiumModel
import com.squareup.picasso.Picasso

class StadiumAdapter(private var lstStadiums: List<StadiumModel>):
    RecyclerView.Adapter<StadiumAdapter.ViewHolder>() {

        class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
            val ivStadium: ImageView = itemView.findViewById(R.id.ivStadium)
            val tvName: TextView = itemView.findViewById(R.id.tvName)
            val tvLocation: TextView = itemView.findViewById(R.id.tvLocation)
            val tvCapacity: TextView = itemView.findViewById(R.id.tvCapacity)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StadiumAdapter.ViewHolder {
        var layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_stadium, parent, false))
    }

    override fun onBindViewHolder(holder: StadiumAdapter.ViewHolder, position: Int) {
        val itemStadium = lstStadiums[position]
        holder.tvName.text = itemStadium.name
        holder.tvCapacity.text = itemStadium.capacity
        holder.tvLocation.text = itemStadium.location
        Picasso
            .get()
            .load(itemStadium.image)
            .into(holder.ivStadium)
    }

    override fun getItemCount(): Int {
        return lstStadiums.size
    }
}