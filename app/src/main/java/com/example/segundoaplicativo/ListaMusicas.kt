package com.example.segundoaplicativo

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ListaMusicas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_musicas)


        // uma variavel que tipifica um componente
        val arrayAdapter: ArrayAdapter<*>

        //Variavel que recebe uma funcao que popula um array
        val musicas = arrayOf(
            "too fast live too young to die",
            "no passo a passo",
            "lutar pelo que é meu",
            "é quente",
            "ela vai voltar(todos os defeitos de uma mulher perfeita)",
            "o mundo explodiu la fora",
            "senhor do tempo",
            "liberdade acima de tudo",
            "abrir seus olhos"
            )

        // Conexao do frontend com o backend
        var lista_musicas = findViewById<ListView>(R.id.listaMusicas) // <-- id do botao ListView em activity_list

        // variavel recebe a funcao arrayAdapter
        // renderiza o layout da lista, carrega uma lista simples
        // e passa a variavel que contem o array
        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,musicas)

        // variavel use a funcao adapter que recebe o arrayAdapter
        lista_musicas.adapter = arrayAdapter

    }
}