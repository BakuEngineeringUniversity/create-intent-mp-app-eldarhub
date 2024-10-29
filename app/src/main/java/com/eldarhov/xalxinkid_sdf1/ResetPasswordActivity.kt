package com.eldarhov.xalxinkid_sdf1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText

class ResetPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password)

        val newPasswordEditText = findViewById<EditText>(R.id.newPassword)
        val confirmNewPasswordEditText = findViewById<EditText>(R.id.confirmNewPassword)
        val saveButton = findViewById<Button>(R.id.saveButton)

        saveButton.setOnClickListener {
        }
    }
}
