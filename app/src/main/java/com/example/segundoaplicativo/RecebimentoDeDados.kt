package com.example.segundoaplicativo

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RecebimentoDeDados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recebimento_de_dados)


        //variavel para receber o conteudo que ta em memoria
        val resultado = intent.getStringExtra("Retorno")

        // Toast para receber os dados
        Toast.makeText(this,"Dado: $resultado", Toast.LENGTH_LONG).show()

    }
}