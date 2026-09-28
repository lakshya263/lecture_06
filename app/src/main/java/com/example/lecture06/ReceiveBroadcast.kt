package com.example.lecture06

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class ReceiveBroadcast: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Log.d("broadcast", "broadcast message received")
        val broadcastMessage = intent?.getStringExtra("message") ?: "no data"
        Toast.makeText(context, broadcastMessage, Toast.LENGTH_SHORT).show()
    }
}