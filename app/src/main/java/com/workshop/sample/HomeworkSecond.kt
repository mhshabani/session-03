package com.workshop.sample

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.RelativeLayout
import android.widget.TextView

class HomeworkSecond : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homework_second)

        val backgroundView = findViewById<RelativeLayout>(R.id.second_layout_background)
        val textView = findViewById<TextView>(R.id.second_layout_text)

        if (intent.extras != null) {
            val intentBackground = intent.extras?.getInt(getString(R.string.MainActivityButtonColorExtra))!!
            val intentText = intent.extras?.getString(getString(R.string.MainActivityButtonTextExtra))

            backgroundView.setBackgroundColor(intentBackground)
            textView.text = intentText
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, HomeworkMain::class.java)
        startActivity(intent)
    }
}
