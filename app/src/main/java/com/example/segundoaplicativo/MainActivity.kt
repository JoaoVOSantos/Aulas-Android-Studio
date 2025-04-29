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
        val BotaoClone : Button = findViewById(R.id.TelaCLone)
        BotaoClone.setOnClickListener{
            var intent = Intent(this, Clone::class.java)
            startActivity(intent)
        }

        val BotaoLista : Button = findViewById(R.id.TelaLista)
        BotaoLista.setOnClickListener{
            var intent = Intent(this, Lista::class.java)
            startActivity(intent)
        }
    }

    fun Lista(view:View){
        // navegação
        var intent = Intent(this, Lista::class.java)
        startActivity(intent)
        //Commit Aula

    }
    fun ListaFixa(view:View){
        // navegação
        var intent = Intent(this, ListaFixa::class.java)
        startActivity(intent)
        //Commit Aula

    }

}