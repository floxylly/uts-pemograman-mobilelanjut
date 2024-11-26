package com.example.utsalma.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.utsalma.R
import com.example.utsalma.ui.WelcomeActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editText)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val userName = editText.text.toString()

            if (userName.isEmpty()) {
                // Menampilkan Toast jika nama kosong
                Toast.makeText(this, "Nama tidak boleh kosong", Toast.LENGTH_SHORT).show()
            } else {
                // Mengirim nama ke WelcomeActivity jika nama tidak kosong
                val intent = Intent(this, WelcomeActivity::class.java)
                intent.putExtra("USER_NAME", userName)
                startActivity(intent)
            }
        }
    }
}
