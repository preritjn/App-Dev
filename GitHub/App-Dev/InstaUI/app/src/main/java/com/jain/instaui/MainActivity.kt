package com.jain.instaui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
         menuInflater.inflate(R.menu.menu_bar,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.miPost -> Toast.makeText(this,"Selected Post",Toast.LENGTH_SHORT).show()
            R.id.miStory -> Toast.makeText(this,"Selected Story",Toast.LENGTH_SHORT).show()
            R.id.miReel -> Toast.makeText(this,"Selected Reel",Toast.LENGTH_SHORT).show()
            R.id.miLive -> Toast.makeText(this,"Selected Live",Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}