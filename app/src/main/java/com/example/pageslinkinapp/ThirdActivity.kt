package com.example.pageslinkinapp


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        val btnNext2: Button = findViewById(R.id.button2)
        val tvFinalData: TextView = findViewById(R.id.tv_final_data)

        // Get the final data from Intent
        val finalData = intent.getStringExtra("finalData") ?: ""

        // Display the final data in TextView
        tvFinalData.text = finalData
        btnNext2.setOnClickListener {
            val nextIntent = Intent(this, MainActivity::class.java)

            startActivity(nextIntent)
        }

    }
}
