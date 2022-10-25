package com.jain.android

import android.Manifest
import android.app.*
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val channelId = "ChannelId"
    private val channelName = "ChannelName"
    private val notificationId = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        createNotificationChannel()

        val intent = Intent(this,MainActivity::class.java)
        val pendingIntent = TaskStackBuilder.create(this).run {
            addNextIntentWithParentStack(intent)
            getPendingIntent(0,PendingIntent.FLAG_UPDATE_CURRENT)
        }

        val notification = NotificationCompat.Builder(this,channelId)
            .setContentTitle("Awesome Notification")
            .setContentText("Downloading")
            .setSmallIcon(R.drawable.ic_notification)
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setContentIntent(pendingIntent)
            .build()

        val notificationManager = NotificationManagerCompat.from(this)

        btnShowNotification.setOnClickListener {
            notificationManager.notify(notificationId,notification)
        }

        btnAddImage.setOnClickListener {
            Intent(Intent.ACTION_GET_CONTENT).also {
                it.type="image/*"
                startActivityForResult(it,0)
            }
        }

        btnRequestPermission.setOnClickListener {
            requestPermission()
        }

        btnApply.setOnClickListener {
            val name = etName.text.toString()
            val rollNo = etRoll.text.toString().toInt()
            val branch = etBranch.text.toString()
//            val details = Details(name, rollNo, branch)
            Intent(this, SecondActivity::class.java).also {
                it.putExtra("Extra_name", name)
                it.putExtra("Extra_roll", rollNo)
                it.putExtra("Extra_branch", branch)
//                it.putExtra("Extra_details", details)
                startActivity(it)
            }
        }

        val sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()

        btnSave.setOnClickListener {
            val name = etName.text.toString()
            val roll = etRoll.text.toString().toInt()
            val branch = etBranch.text.toString()

            editor.apply {
                putString("name",name)
                putInt("Roll",roll)
                putString("Branch",branch)
                apply()
            }
        }

        btnLoad.setOnClickListener {
            val name = sharedPref.getString("name",null)
            val roll = sharedPref.getInt("Roll",0)
            val branch = sharedPref.getString("Branch",null)

            etName.setText(name)
            etRoll.setText(roll.toString())
            etBranch.setText(branch)
        }
    }

    fun createNotificationChannel() {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel =
                NotificationChannel(channelId, channelName, NotificationManager.IMPORTANCE_DEFAULT)

            val manager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            manager.createNotificationChannel(channel)
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

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode== Activity.RESULT_OK && requestCode==0) {
            val uri = data?.data
            image.setImageURI(uri)
        }

    }

    private fun writeExternalStorage() =
        ContextCompat.checkSelfPermission(this,Manifest.permission.WRITE_EXTERNAL_STORAGE)==PackageManager.PERMISSION_GRANTED

    private fun backgroundLocation() =
        ContextCompat.checkSelfPermission(this,Manifest.permission.ACCESS_BACKGROUND_LOCATION)==PackageManager.PERMISSION_GRANTED

    private fun foregroundLocation() =
        ContextCompat.checkSelfPermission(this,Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED



    private fun requestPermission() {
        val permissionToRequest= mutableListOf<String>()
        if(!writeExternalStorage())
            permissionToRequest.add(Manifest.permission.WRITE_EXTERNAL_STORAGE)
        if(!backgroundLocation())
            permissionToRequest.add(Manifest.permission.ACCESS_BACKGROUND_LOCATION)
        if(!foregroundLocation())
            permissionToRequest.add(Manifest.permission.ACCESS_COARSE_LOCATION)

        if(permissionToRequest.isNotEmpty())
            ActivityCompat.requestPermissions(this,permissionToRequest.toTypedArray(),0)
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode==0 && grantResults.isNotEmpty())
            for(i in grantResults.indices)
                if(grantResults[i]==PackageManager.PERMISSION_GRANTED)
                    Log.d("PermissionsRequest","${permissions[i]} granted.")
    }

    private fun nxtActivity() {
        Intent(this,SecondActivity::class.java).also {
            startActivity(it)
        }
    }
}