package com.workshop.sample

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button

class HomeworkMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homework_main)

        val listener = View.OnClickListener {
            val buttonText = (it as Button).text.toString()
            val buttonColor = (it.background as ColorDrawable).color
            val intent = Intent(it.context, HomeworkSecond::class.java)
            intent.putExtra(getString(R.string.MainActivityButtonTextExtra), buttonText)
            intent.putExtra(getString(R.string.MainActivityButtonColorExtra), buttonColor)
            startActivity(intent)
        }
        findViewById<Button>(R.id.green_button).setOnClickListener(listener)
        findViewById<Button>(R.id.red_button).setOnClickListener(listener)
        findViewById<Button>(R.id.blue_button).setOnClickListener(listener)
        findViewById<Button>(R.id.orange_button).setOnClickListener(listener)
        findViewById<Button>(R.id.purple_button).setOnClickListener(listener)
        findViewById<Button>(R.id.yellow_button).setOnClickListener(listener)
    }
}
