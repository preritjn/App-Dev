package com.jain.android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_fourth.*

class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        val todoList = mutableListOf(
            Todo("Follow Android Devs",false),
            Todo("Learn about RecyclerView",false),
            Todo("Feed my Cat",false),
            Todo("Bring Groceries",false),
            Todo("Prank my Seniors",false),
            Todo("Fuck my college",false),
            Todo("Take a Shower",false),
            Todo("Call my mom",false)
        )

        val adapter=TodoAdapter(todoList)
        rvTodo.adapter=adapter
        rvTodo.layoutManager=LinearLayoutManager(this)

        btnAddTodo.setOnClickListener {
            val title=etTodo.text.toString()
            val todo=Todo(title,false)
            todoList.add(todo)
            adapter.notifyItemChanged(todoList.size-1)
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
        Intent(this,ThirdActivity::class.java).also {
            startActivity(it)
        }
    }
}