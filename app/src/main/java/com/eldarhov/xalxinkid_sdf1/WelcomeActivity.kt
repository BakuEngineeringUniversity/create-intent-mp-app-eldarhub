package com.eldarhov.xalxinkid_sdf1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome) // Ensure this is your correct layout

        // Initialize your buttons
        val loginButton: Button = findViewById(R.id.loginButton)
        val signupButton: Button = findViewById(R.id.signupButton)

        // Set click listener for the login button
        loginButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java) // Change to your LoginActivity
            startActivity(intent)
        }

        // Set click listener for the signup button
        signupButton.setOnClickListener {
            val intent = Intent(this, RegistrationActivity::class.java) // Change to your RegistrationActivity
            startActivity(intent)
        }
    }
}
