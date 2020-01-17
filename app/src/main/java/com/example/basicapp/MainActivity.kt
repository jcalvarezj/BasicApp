package com.example.kotlinjava

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    lateinit var txtPassword: EditText
    lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtPassword = findViewById(R.id.txtPassword)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener {
            var isValid: Boolean = Validations.validate(txtPassword)
            Log.e(TAG, "onClick: $isValid")
            if (isValid) {
                Toast.makeText(this, "Correcto :)", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, ListActivity::class.java))
            }
            else {
                Toast.makeText(this, "INCORRECTO!! >:C", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
