package com.pokosho.planingpoker

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class CardActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)
        val button = findViewById<Button>(R.id.card_button)
        button.text = intent.getStringExtra(ExtraKeys.Card.toString())
        button.setOnClickListener {
            finish()
        }
    }
}
