package com.example.ovman.firstkotlin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : Activity() {

    var rValue: Int=0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun random(view: View){
        val r = Random()
        rValue = r.nextInt(100)
        val text = findViewById<TextView>(R.id.textView)
        text.setText(rValue.toString())
    }

    fun next(view: View){
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("Número",rValue)
        startActivity(intent)
    }
}
