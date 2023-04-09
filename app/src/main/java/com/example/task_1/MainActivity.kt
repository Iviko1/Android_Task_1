package com.example.task_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var registerBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        registerBtn = findViewById(R.id.registerBtn)


        registerBtn.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)

            startActivity(intent)
        }
    }
}