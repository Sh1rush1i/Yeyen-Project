package com.example.newyeyen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AboutAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        val rate = findViewById<Button>(R.id.btnfb)
        rate.setOnClickListener {
            val intent = Intent(this@AboutAct, FeedbackAct::class.java)
            startActivity(intent)
        }
    }
}