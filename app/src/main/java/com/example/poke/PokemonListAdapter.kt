package com.example.poke

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BeerListAdapter () : RecyclerView.Adapter<BeerListAdapter.MyViewHolder>() {

    var items: List<Beer> = listOf()
    fun set(list: List<Beer>){
        items = list.toList()
        notifyDataSetChanged()
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.poke_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        //Glide.with(img_pokemon).load(items[position].img).into(holder.img_pokemon)
        val item = items[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = items.size

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: Beer){
            itemView.apply {
            }
        }


    }


}
