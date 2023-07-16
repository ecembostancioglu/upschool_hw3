package com.example.homework3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class PersonalInfoActivity : AppCompatActivity() {
    private lateinit var editTextEmail: EditText
    private lateinit var editTextPhone: EditText
    private lateinit var editTextCountry: EditText
    private lateinit var buttonNext: Button
    private lateinit var name: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personal_info)

        editTextEmail = findViewById(R.id.editTextEmail)
        editTextPhone = findViewById(R.id.editTextPhone)
        editTextCountry = findViewById(R.id.editTextCountry)
        buttonNext = findViewById(R.id.buttonNext)

        name = intent.getStringExtra("name") ?: ""

        val appBar = supportActionBar
        appBar?.title = name



        buttonNext.setOnClickListener {
            val email = editTextEmail.text.toString().trim()
            val phone = editTextPhone.text.toString().trim()
            val country = editTextCountry.text.toString().trim()

            val personalInfo = PersonalInfo(name, email, phone, country)

            val intent = Intent(this@PersonalInfoActivity, QuestionPageActivity::class.java)
            intent.putExtra("personalInfo", personalInfo)
            startActivity(intent)
        }
    }

}
