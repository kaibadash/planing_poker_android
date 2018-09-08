package com.pokosho.planingpoker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.cards_view)
        val layoutManager = GridLayoutManager(this, 3)
        recyclerView.layoutManager = layoutManager

        val cards = listOf("0","0.5","1","2","3","5","8","13","20","40","100","?")
        recyclerView.adapter = CardAdapter(this, cards) {
            Toast.makeText(this, it, Toast.LENGTH_LONG).show()
        }
    }
}
