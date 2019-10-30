package com.br.aula02

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

const val USERNAME_TAG : String = "usertag"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {
            if(edtUsername.text.isNotBlank() && edtPassword.text.isNotEmpty()){
                //Toast.makeText(applicationContext, "Efetuando Login...", Toast.LENGTH_LONG).show()

                //Construindo ação para invocar a proxima tela
                val intent = Intent(applicationContext, tela_usuario::class.java).apply {
                    putExtra(USERNAME_TAG, edtUsername.text.toString())
                }

                startActivity(intent)
            }else{
                Toast.makeText(applicationContext, "Falha de Login.", Toast.LENGTH_LONG).show()
            }
        }
    }
}
