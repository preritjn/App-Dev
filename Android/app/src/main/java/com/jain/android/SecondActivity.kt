package com.jain.android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.custom_toast.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val name=intent.getStringExtra("Extra_name")
        val roll=intent.getIntExtra("Extra_roll",0)
        val branch=intent.getStringExtra("Extra_branch")
//        val details=intent.getSerializableExtra("Extra-details") as Details
        val str="$name of $roll of $branch"
//        tv1.text=details.toString()
        tv.text=str

        btnShowCustom.setOnClickListener {
            Toast(this).apply {
                duration = Toast.LENGTH_LONG
                view =layoutInflater.inflate(
                    R.layout.custom_toast,layoutCustomToast)
                show()
            }
        }

        btnShow.setOnClickListener {
            Toast.makeText(this, "This a toast", Toast.LENGTH_SHORT).show()
        }

        spBranch.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(adapterView: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@SecondActivity, "You selected ${adapterView?.getItemAtPosition(position)
                    .toString()}", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }

        val customList= arrayOf("First","Second","Third","Forth")
        val adapter=ArrayAdapter<String>(this, com.google.android.material.R.layout.support_simple_spinner_dropdown_item,customList)
        spCustom.adapter=adapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.appbar_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.addContact -> Toast.makeText(this, "You selected Add contact", Toast.LENGTH_SHORT).show()
            R.id.settings -> Toast.makeText(this, "You selected Settings", Toast.LENGTH_SHORT).show()
            R.id.favourite -> Toast.makeText(this, "You selected Favourite", Toast.LENGTH_SHORT).show()
            R.id.closeApp -> finish()
            R.id.Feedback -> Toast.makeText(this, "You selected Give Feedback", Toast.LENGTH_SHORT).show()
            R.id.nxtActivity -> nxtActivity()
        }
        return true
    }

    private fun nxtActivity(){
        Intent(this,ThirdActivity::class.java).also {
            startActivity(it)
        }
    }
}