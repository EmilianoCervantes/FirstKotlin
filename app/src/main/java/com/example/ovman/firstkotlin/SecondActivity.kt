package com.example.ovman.firstkotlin

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val n = intent.getIntExtra("Número", -1)

        val texto = findViewById<TextView>(R.id.textView2)

        texto.setText(n.toString())
    }
}
