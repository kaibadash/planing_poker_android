package com.pokosho.planingpoker

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.cards_view)
        val layoutManager = GridLayoutManager(this, 3)
        recyclerView.layoutManager = layoutManager

        val cards = listOf("0", "0.5", "1", "2", "3", "5", "8", "13", "20", "40", "100", "?")
        recyclerView.adapter = CardAdapter(this, cards) {
            val intent = Intent(this, CardActivity::class.java)
            intent.putExtra(ExtraKeys.Card.toString(), it)
            startActivity(intent)
        }
    }
}
