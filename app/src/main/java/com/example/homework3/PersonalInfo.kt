package com.example.homework3

import java.io.Serializable

data class PersonalInfo(val name: String, val email: String, val phone: String, val country: String) : Serializable

data class PersonalInfoData(val q1: String, val q2: String, val q3: String) : Serializable
