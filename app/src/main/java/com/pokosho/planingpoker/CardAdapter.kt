package com.pokosho.planingpoker

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button

class CardAdapter(
        private val context: Context,
        private val itemList: List<String>,
        private val itemClickListener: (String)->Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(context)
        val view = layoutInflater.inflate(R.layout.card, parent, false)
        val viewHolder = CardViewHolder(view)

        val button = view.findViewById<Button>(R.id.card_button)
        button.setOnClickListener {
            itemClickListener(itemList[viewHolder.adapterPosition])
        }

        return viewHolder
    }

    override fun getItemCount(): Int {
        return itemList.count()
    }

    override fun onBindViewHolder(parent: RecyclerView.ViewHolder, index: Int) {
        val button = parent.itemView.findViewById<Button>(R.id.card_button)
        button.text = itemList[index]
    }
}