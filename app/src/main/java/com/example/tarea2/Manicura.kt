package com.example.tarea2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tarea2.ui.theme.Tarea2Theme

class Manicura : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.manicura)
        val reservarBtn = findViewById<Button>(R.id.reservarBtn)
        reservarBtn.setOnClickListener {
            val Intent1 = Intent(this, Reserva_Exitosa::class.java)
            startActivity(Intent1)
        }
        val exitBtn = findViewById(R.id.exitBtn) as ImageView
        exitBtn.setOnClickListener {
            val Intent5 = Intent(this, MainActivity::class.java)
            startActivity(Intent5)
        }
    }


}

