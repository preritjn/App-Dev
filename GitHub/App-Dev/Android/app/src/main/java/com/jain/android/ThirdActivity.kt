package com.jain.android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val addContactDialog = AlertDialog.Builder(this)
            .setTitle("Add Contact")
            .setIcon(R.drawable.ic_addcontact)
            .setMessage("Do you want to add this contact?")
            .setPositiveButton("Yes") { _, _ ->
                Toast.makeText(this, "You added this contact to your list", Toast.LENGTH_SHORT)
                    .show()
            }
            .setNegativeButton("No") { _, _ ->
                Toast.makeText(this,"You didn't added this contact to your list", Toast.LENGTH_SHORT).show()
            }.create()

        btnAlertBox1.setOnClickListener {
            addContactDialog.show()
        }

        val options= arrayOf("First Item","Second Item","Third Item")
        val singleChoiceDialog=AlertDialog.Builder(this)
            .setTitle("Choose any one")
            .setSingleChoiceItems(options,0) { _, i->
                Toast.makeText(this, "You choose ${options[i]}", Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Accept") {_,_ ->
                Toast.makeText(this, "You accepted single choice item", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline") { _,_ ->
                Toast.makeText(this, "You declined single choice item", Toast.LENGTH_SHORT).show()
            }.create()

        btnAlertBox2.setOnClickListener {
            singleChoiceDialog.show()
        }

        val multiChoiceDialog=AlertDialog.Builder(this)
            .setTitle("Choose any one")
            .setMultiChoiceItems(options, booleanArrayOf(false,false,false)) { _, i, isChecked->
                if(isChecked)
                Toast.makeText(this, "You checked ${options[i]}", Toast.LENGTH_SHORT).show()
                else
                    Toast.makeText(this, "You unchecked ${options[i]}", Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Accept") {_,_ ->
                Toast.makeText(this, "You accepted single choice item", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline") { _,_ ->
                Toast.makeText(this, "You declined single choice item", Toast.LENGTH_SHORT).show()
            }.create()

        btnAlertBox3.setOnClickListener {
            multiChoiceDialog.show()
        }
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

    private fun nxtActivity() {
        Intent(this,FourthActivity::class.java).also {
            startActivity(it)
        }
    }
}