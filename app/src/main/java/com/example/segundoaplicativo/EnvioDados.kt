package com.example.segundoaplicativo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EnvioDados : AppCompatActivity() {
    lateinit var campoTexto : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_envio_dados)

        val botaoEnviar : Button = findViewById(R.id.butao)
        botaoEnviar.setOnClickListener{

            // Buscar no front end a caixa de texto e atribuir em uma variavel
            campoTexto = findViewById(R.id.campoTexto)

            // contexto, nome da tela. java
            val intent = Intent(this,RecebimentoDeDados::class.java)

            // na intencao de clique, pego o dado que veio da caixatexto e converto em string
            intent.putExtra("Retorno", campoTexto.text.toString())

            // iniciar a navegação de tela
            startActivity(intent)
        }

    }
}