package com.example.tarea2

import android.content.*
import android.os.Bundle
import android.widget.*
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

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        val inicioActBtn = findViewById<Button>(R.id.ingresarBtn)
        inicioActBtn.setOnClickListener {
            val Intent = Intent(this, Inicio::class.java)
            startActivity(Intent)
        }
    }
        private fun irInicio() {

        }
        }
