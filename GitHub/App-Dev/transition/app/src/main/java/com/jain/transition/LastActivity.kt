package com.jain.transition

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LastActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last)

        val button1=findViewById<Button>(R.id.btnGoBack)

        button1.setOnClickListener {
            finish()
            overridePendingTransition(R.anim.back2,R.anim.back1)
        }
    }
}