package com.example.segundoaplicativo

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Musicas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_musicas)

    }

    fun btnMusicas(view: View){
        var intent = Intent(this, Musicas::class.java)
        startActivity(intent)
        overridePendingTransition(0, 0) // Remove a animação

    }
    fun btnLista(view: View){
        var intent = Intent(this, ListaMusicas::class.java)
        startActivity(intent)
        overridePendingTransition(0, 0) // Remove a animação

    }
    fun btnArtistas(view: View){
        var intent = Intent(this, AtividadeAppSpotify::class.java)
        startActivity(intent)
        overridePendingTransition(0, 0) // Remove a animação

    }

    fun btnListaMusicas(view:View){
        var intent = Intent(this, ListaMusicas::class.java)
        startActivity(intent)
        overridePendingTransition(0, 0) // Remove a animação

    }
}