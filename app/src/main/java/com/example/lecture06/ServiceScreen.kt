package com.example.lecture06

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.w3c.dom.Text

@Composable
fun ServiceScreen(
    onStart: () -> Unit,
    onStop: () -> Unit,
    sendBroadcastMessage: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = onStart
        ) {
            Text(
                text = "Start Service"
            )
        }
        Button(
            onClick = onStop
        ) {
            Text(
                text = "Stop Service"
            )
        }

        Button(
            onClick = sendBroadcastMessage
        ) {
            Text(
                text = "Send Broadcast"
            )
        }
    }
}