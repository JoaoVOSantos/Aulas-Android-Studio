package com.example.segundoaplicativo

import android.app.AlertDialog
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Aprendendo_Modal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aprendendo_modal)

        val title = AlertDialog.Builder(this)
            .setTitle("Atualizar o sistema do seu celular?")
            .setMessage("Você quer atualizar agora?")
            .setPositiveButton("Atualizar"){
                    variavel, opcaoBotao -> // logica para apagar o banco
            }
            .setNegativeButton("Não Atualizar"){
                    variavel, opcaoBotao -> // sem logica
            }
            .setNeutralButton("Mais tarde"){
                    variavel, opcaoBotao -> // uma terceira logica
            }
            .create()
            .show()


    }
}