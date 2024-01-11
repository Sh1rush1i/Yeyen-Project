package com.example.newyeyen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val login = findViewById<Button>(R.id.login_btn)
        login.setOnClickListener {
            val intent = Intent(this@LoginAct, HomeAct::class.java)
            startActivity(intent)
            finish()
        }
        val forgot = findViewById<TextView>(R.id.frgt)
        forgot.setOnClickListener {
            val intent = Intent(this@LoginAct, ForgotPwAct::class.java)
            startActivity(intent)
            finish()
        }
    }
}