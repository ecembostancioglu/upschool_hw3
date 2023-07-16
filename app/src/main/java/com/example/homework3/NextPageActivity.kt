package com.example.homework3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class NextPageActivity : AppCompatActivity() {
    private lateinit var textViewInfo: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_page)

        textViewInfo = findViewById(R.id.textViewInfo)

        val personalInfo = intent.getSerializableExtra("personalInfo") as? PersonalInfo

        val infoText = "Name Surname: ${personalInfo?.name}\nE-mail: ${personalInfo?.email}\nPhone: ${personalInfo?.phone}\nCountry: ${personalInfo?.country}"
        textViewInfo.text = infoText
    }

}
