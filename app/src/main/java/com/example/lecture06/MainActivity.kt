package com.example.lecture06

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lecture06.ui.theme.Lecture06Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lecture06Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ServiceScreen(
                        onStart = {
                            startService(
                                Intent(
                                    this, ForegroundService::class.java
                                )
                            )
                        },
                        onStop = {
                            stopService(
                                Intent(
                                    this,
                                    ForegroundService::class.java
                                )
                            )
                        },
                        sendBroadcastMessage = {
                            val intent = Intent(this, ReceiveBroadcast::class.java).apply {
                                putExtra("message", "this is a broadcast message")
                            }
                            sendBroadcast(intent)
                            Log.d("broadcast", "broadcast message sent")
                        }
                    )
                }
            }
        }
    }
}