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

class Inicio : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Menu Principal
        setContentView(R.layout.inicio)
        //Acceso a Menu de Corte
        val corteBtn = findViewById(R.id.corteBtn) as ImageView
        corteBtn.setOnClickListener {
            val Intent1 = Intent(this, Corte_Cabello::class.java)
            startActivity(Intent1)
        }
        //Acceso a Menu de Alaciado
        val alaciadoBtn = findViewById(R.id.alaciadoBtn) as ImageView
        alaciadoBtn.setOnClickListener {
            val Intent2 = Intent(this, Alaciado_Cabello::class.java)
            startActivity(Intent2)
        }
        //Acceso a Menu de Manicura
        val manicuraBtn = findViewById(R.id.manicuraBtn) as ImageView
        manicuraBtn.setOnClickListener {
            val Intent3 = Intent(this, Manicura::class.java)
            startActivity(Intent3)
        }
        //Acceso a Menu de Maquillaje
        val maquillajeBtn = findViewById(R.id.maquillajeBtn) as ImageView
        maquillajeBtn.setOnClickListener {
            val Intent4 = Intent(this, Maquillaje::class.java)
            startActivity(Intent4)
        }

        val exitBtn = findViewById(R.id.exitBtn) as ImageView
        exitBtn.setOnClickListener {
            val Intent5 = Intent(this, MainActivity::class.java)
            startActivity(Intent5)
        }

    }
}

