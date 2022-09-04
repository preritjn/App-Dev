package com.jain.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()
        val thirdFragment = ThirdFragment()

        setCurrentFragment(firstFragment)

//        btnFirstFragment.setOnClickListener {
//            supportFragmentManager.beginTransaction().apply {
//                replace(R.id.flLayout, firstFragment)
//                addToBackStack(null)
//                commit()
//            }
//        }
//
//        btnSecondFragment.setOnClickListener {
//            supportFragmentManager.beginTransaction().apply {
//                replace(R.id.flLayout, secondFragment)
//                addToBackStack(null)
//                commit()
//            }
//        }

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.miHome -> setCurrentFragment(firstFragment)
                R.id.miMessage -> setCurrentFragment(secondFragment)
                R.id.miProfile -> setCurrentFragment(thirdFragment)
            }
            true
        }

        bottomNavigationView.getOrCreateBadge(R.id.miMessage).apply {
            number=10
            isVisible=true
        }
    }

    private fun setCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flLayout, fragment)
            commit()
        }
    }
}