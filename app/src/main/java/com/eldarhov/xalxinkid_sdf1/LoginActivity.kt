package com.eldarhov.xalxinkid_sdf1

import android.content.Intent // Don't forget to import this!
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Initialize UI components
        val emailEditText = findViewById<EditText>(R.id.email)
        val passwordEditText = findViewById<EditText>(R.id.password)
        val loginButton = findViewById<Button>(R.id.loginButton)
        val forgotPasswordTextView: TextView = findViewById(R.id.forgotPassword)

        // Set up the click listener for the "Forgot Password?" text
        forgotPasswordTextView.setOnClickListener {
            val intent = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(intent)
        }

        // Set up the click listener for the login button
        loginButton.setOnClickListener {
            // Handle login logic here
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()
            // Add your login logic (e.g., validation, API call, etc.)
        }
    }
}