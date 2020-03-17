package com.financas.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import com.financas.R
import com.financas.ui.adapter.ListaTransacoesAdapter
import kotlinx.android.synthetic.main.activity_lista_transacoes.*

class ListaTransasoesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)

        val transasoes: List<String> = listOf("Comida - R$ 20,50", "Economia - R$ 100,00")
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, transasoes)
        lista_transacoes_listview.setAdapter(ListaTransacoesAdapter(transasoes, this))
    }
}