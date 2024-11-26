package com.example.utsalma.ui

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.utsalma.R

class WelcomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val userName = intent.getStringExtra("USER_NAME") ?: "Pengguna"
        val welcomeMessage = findViewById<TextView>(R.id.textView)
        welcomeMessage.text = "Halo, $userName! Selamat datang di aplikasi kami."
    }
}
