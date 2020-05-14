package com.example.clickevent

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val textViewClickMe = findViewById<TextView>(R.id.textFieldClickMe);

        textViewClickMe.setOnClickListener {
            Toast.makeText(this@MainActivity,
                "You click me on the text view: Click me!", Toast.LENGTH_SHORT).show();
        }
    }
}