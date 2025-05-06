package com.example.segundoaplicativo

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide

class Carregamento : AppCompatActivity() {
    lateinit var txtURL: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carregamento)



    }

    fun CarregarImagem(view: View){
            txtURL = findViewById(R.id.txtURL)
            var url = txtURL.text.toString()
            var imgDinamico = findViewById<ImageView>(R.id.imgDinamico)
            Glide.with(this).load(url).into(imgDinamico)
    }
}