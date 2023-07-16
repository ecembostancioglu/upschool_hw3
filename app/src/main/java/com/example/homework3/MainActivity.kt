package com.example.homework3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {


    private lateinit var editTextName: EditText
    private lateinit var buttonStartSurvey: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        editTextName = findViewById(R.id.editTextName)
        buttonStartSurvey = findViewById(R.id.buttonStartSurvey)

        buttonStartSurvey.setOnClickListener {
            val name = editTextName.text.toString().trim()

            if (name.isNotEmpty()) {
                val intent = Intent(this@MainActivity, PersonalInfoActivity::class.java)
                intent.putExtra("name", name)
                startActivity(intent)
            }
        }


    }
}
