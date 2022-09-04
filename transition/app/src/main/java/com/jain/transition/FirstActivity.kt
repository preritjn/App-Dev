package com.jain.transition

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val button=findViewById<Button>(R.id.btnSecondActivity)

        button.setOnClickListener {
            Intent(this,SecondActivity::class.java).also {
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