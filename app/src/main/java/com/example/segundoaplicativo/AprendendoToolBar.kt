package com.example.segundoaplicativo

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class AprendendoToolBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clone)

        setSupportActionBar(findViewById(R.id.toolbar))
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_manu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item?.itemId){

            R.id.btn1 ->{
                Toast.makeText(this,"Eu sou o botao 1", Toast.LENGTH_LONG).show()
            }
            R.id.btn2 ->{
                Toast.makeText(this,"Eu sou o botao 2", Toast.LENGTH_LONG).show()
            }
            R.id.btn3 ->{
                Toast.makeText(this,"Eu sou o botao 3", Toast.LENGTH_LONG).show()
            }
            R.id.btn4 ->{
                Toast.makeText(this,"Eu sou o botao 4", Toast.LENGTH_LONG).show()
            }
            R.id.btn5 ->{
                Toast.makeText(this,"Eu sou o botao 5", Toast.LENGTH_LONG).show()
            }

        }

        return super.onOptionsItemSelected(item)
    }
}