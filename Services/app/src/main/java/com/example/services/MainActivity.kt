package com.example.services

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStart.setOnClickListener {
            Intent(this,MyService::class.java).also {
               startService(it)
                tvServiceInfo.text = "Service Running..."
            }
        }

        btnStop.setOnClickListener {
            Intent(this,MyService::class.java).also {
            stopService(it)
                tvServiceInfo.text = "Service Stopped..."
            }
        }
        btnSendData.setOnClickListener {
            Intent(this,MyService::class.java).also {
                val dataString = etData.text.toString()
                it.putExtra("EXTRA_DATA",dataString)
                startService(it)
            }
        }
    }
}