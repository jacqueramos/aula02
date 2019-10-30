package com.br.aula02

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tela_usuario.*

class tela_usuario : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_usuario)

        var nomeUsuario = intent.getStringExtra(USERNAME_TAG)
        tvBemVindo.text = "Bem vindo, $nomeUsuario"
    }
}
