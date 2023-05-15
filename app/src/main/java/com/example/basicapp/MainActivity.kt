package com.example.basicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn = findViewById<Button>(R.id.enterBtn)
        val txtName = findViewById<EditText>(R.id.editTextTextPersonName)
        val message = txtName.text.toString()

        btn.setOnClickListener()
        {
            Toast.makeText(this, "Hello " + txtName.text, Toast.LENGTH_LONG).show()
        }
    }
}