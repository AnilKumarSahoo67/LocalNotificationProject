package com.example.localnotification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val notificationService = NotificationService(applicationContext)

        val btnSendNotification = findViewById<Button>(R.id.btnSendNotification)

        btnSendNotification.setOnClickListener{
            notificationService.showNotification(NotificationCounter.counter)
        }
    }
}