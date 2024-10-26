package com.eldarhov.xalxinkid_sdf1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val fullNameEditText = findViewById<EditText>(R.id.fullName)
        val emailEditText = findViewById<EditText>(R.id.email)
        val passwordEditText = findViewById<EditText>(R.id.password)
        val confirmPasswordEditText = findViewById<EditText>(R.id.confirmPassword)
        val signUpButton = findViewById<Button>(R.id.signupButton)

        signUpButton.setOnClickListener {
            // Handle sign-up logic here
        }
    }
}
