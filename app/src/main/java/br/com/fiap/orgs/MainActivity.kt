package br.com.fiap.orgs

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView

/**
A classe MainActivity é a tela principal do aplicativo.
*/
class MainActivity : Activity() {

/**
Método chamado quando a atividade é criada
*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Binding: processo de vinculação do código fonte com o arquivo de layout.

        // Encontra o TextView com o ID "nome" no layout e atribui à variável "nome" o título do item.
        val nome: TextView = findViewById(R.id.nome)
        nome.text = "Cesta de frutas"

        // Encontra o TextView com o ID "descricao" no layout e atribui à variável "descricao" as frutas que estão na cesta.
        val descricao: TextView = findViewById(R.id.descricao)
        descricao.text = "Laranja, manga e uva"

        // Encontra o TextView com o ID "valor" no layout e atribui à variável "valor" o preço final dos itens na cesta.
        val valor: TextView = findViewById(R.id.valor)
        valor.text = "19.99"
    }
}