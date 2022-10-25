package com.jain.transition

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val button=findViewById<Button>(R.id.btnLastActivity)

        button.setOnClickListener {
            Intent(this,LastActivity::class.java).also {
                startActivity(it)
                overridePendingTransition(R.anim.zoom_in,R.anim.static_animation)
            }
        }

        val button1=findViewById<Button>(R.id.btnGoBack)

        button1.setOnClickListener {
            finish()
            overridePendingTransition(R.anim.back2,R.anim.back1)
        }
    }
}