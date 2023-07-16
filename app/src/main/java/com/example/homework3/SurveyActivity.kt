package com.example.homework3

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SurveyActivity : AppCompatActivity() {
    private lateinit var textViewWelcome: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_survey)

        textViewWelcome = findViewById(R.id.textViewWelcome)

        val name = intent.getStringExtra("name")
        textViewWelcome.text = "Hoş geldiniz, $name!"
    }
}
