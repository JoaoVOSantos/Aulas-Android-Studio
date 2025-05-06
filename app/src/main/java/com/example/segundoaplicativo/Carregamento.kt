package com.example.segundoaplicativo

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Carregamento : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carregamento)

    }

    fun CarregarImagem(view: View){
        var url = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fopen.spotify.com%2Fartist%2F1on7ZQ2pvgeQF4vmIA09x5&psig=AOvVaw38pr5tRa6z7qm8VoSxS6og&ust=1746577471108000&source=images&cd=vfe&opi=89978449&ved=0CBQQjRxqFwoTCODj_JnKjY0DFQAAAAAdAAAAABAE"
        var imgDinamico = findViewById<ImageView>(R.id.imgDinamico)
        var intent = Intent(this, Carregamento::class.java)
        startActivity(intent)

    }
}