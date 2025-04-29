package com.example.segundoaplicativo

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Lista : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lista)

        // uma variavel que tipifica um componente
        val arrayAdapter:ArrayAdapter<*>
        //Variavel que recebe uma funcao que popula um array
        val cantores = arrayOf("Tião Carreio",
                                "Leandro e o leonardo",
                                "Zezé di carmargo e Luciano",
                                "Icaro e Gilmar")

        // Conexao do frontend com o backend
        var lista = findViewById<ListView>(R.id.lista) // <-- id do botao ListView em activity_list

        // variavel recebe a funcao arrayAdapter
        // renderiza o layout da lista, carrega uma lista simples
        // e passa a variavel que contem o array
        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,cantores)

        // variavel use a funcao adapter que recebe o arrayAdapter
        lista.adapter = arrayAdapter
        //Commit Aula
    }
}