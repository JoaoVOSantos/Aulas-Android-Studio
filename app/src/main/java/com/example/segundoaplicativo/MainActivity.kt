package com.example.segundoaplicativo

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoCalculadora : Button = findViewById(R.id.telaCalculadora)
        botaoCalculadora.setOnClickListener{
            var intent = Intent(this, calculadora::class.java)
            startActivity(intent)
        }
        val botaoTelaLogin : Button = findViewById(R.id.telaDeLogin)
        botaoTelaLogin.setOnClickListener{
            var intent = Intent(this, Exercicio_Login_RelativeLayout::class.java)
            startActivity(intent)
        }
        val botaoEnvioDados : Button = findViewById(R.id.telaEnvioDados)
        botaoEnvioDados.setOnClickListener{
            var intent = Intent(this, EnvioDados::class.java)
            startActivity(intent)
        }
        val BotaoToolbar : Button = findViewById(R.id.telaToolBar)
        BotaoToolbar.setOnClickListener{
            var intent = Intent(this, AprendendoToolBar::class.java)
            startActivity(intent)
        }

    }
    fun AprendendoRelativeLayout(view:View){
        var intent = Intent(this, RelativeLayoutAprendizagem::class.java)
        startActivity(intent)

    }

    fun AprendendoModal(view:View){
        var intent = Intent(this, Aprendendo_Modal::class.java)
        startActivity(intent)

    }

    fun Lista(view:View){
        var intent = Intent(this, Lista::class.java)
        startActivity(intent)

    }
    fun ListaFixa(view:View){
        var intent = Intent(this, ListaFixa::class.java)
        startActivity(intent)

    }

    fun Carregamento(view:View){
        var intent = Intent(this, Carregamento::class.java)
        startActivity(intent)

    }

    fun AtividadeAppMusica(view:View){
        var intent = Intent(this, AtividadeAppSpotify::class.java)
        startActivity(intent)

    }

}