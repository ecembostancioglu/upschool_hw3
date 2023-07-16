package com.example.homework3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class QuestionPageActivity : AppCompatActivity() {

    private lateinit var question1TextView: TextView
    private lateinit var question2TextView: TextView
    private lateinit var question3TextView: TextView
    private lateinit var question1editText: EditText
    private lateinit var question2editText: EditText
    private lateinit var question3editText: EditText
    private lateinit var buttonNext: Button
    private lateinit var name: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_page)

        question1TextView = findViewById(R.id.q1TextView)
        question2TextView = findViewById(R.id.q2TextView)
        question3TextView = findViewById(R.id.q3TextView)
        question1editText = findViewById(R.id.editTextQ1)
        question2editText = findViewById(R.id.editTextQ2)
        question3editText = findViewById(R.id.editTextQ3)
        buttonNext = findViewById(R.id.buttonNext)

        name = intent.getStringExtra("name") ?: ""
        question1TextView.text = "Do you like sleeping?"
        question2TextView.text = "Are you interested in sport?"
        question3TextView.text = "Are you a realistic person?"



        buttonNext.setOnClickListener {
            val question1 = question1editText.text.toString().trim()
            val question2 = question2editText.text.toString().trim()
            val question3 = question3editText.text.toString().trim()

            val personalInfo3 = PersonalInfoData(question1,question2,question3)

            val intent = Intent(this@QuestionPageActivity, NextPageActivity::class.java)
            intent.putExtra("personalInfo3", personalInfo3)
            startActivity(intent)
        }
    }

}