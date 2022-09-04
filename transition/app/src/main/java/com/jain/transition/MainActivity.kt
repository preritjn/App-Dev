package com.jain.transition

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.AnimationUtils
import android.widget.Button
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import com.jain.transition.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animation = AnimationUtils.loadAnimation(this,R.anim.explosion_anim).apply {
            duration =780
            interpolator = AccelerateDecelerateInterpolator()
        }

        binding.fab.setOnClickListener {
            binding.fab.isVisible = false
            binding.circle.isVisible = true
            binding.circle.startAnimation(animation){
                // display fragment
                binding.root.setBackgroundColor(ContextCompat.getColor(this,R.color.purple_500))
                binding.circle.isVisible=false
            }
        }
        findViewById<Button>(R.id.btnFirstActivity).setOnClickListener {
            Intent(this, FirstActivity::class.java).also {
                startActivity(it)
                overridePendingTransition(R.anim.zoom_in, R.anim.static_animation)
            }
        }
    }
}
