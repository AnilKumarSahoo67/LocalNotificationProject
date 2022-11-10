package com.example.localnotification

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class CounterNotificationReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent?) {
        val notificationService = NotificationService(context)
        notificationService.showNotification(++NotificationCounter.counter)
    }
}