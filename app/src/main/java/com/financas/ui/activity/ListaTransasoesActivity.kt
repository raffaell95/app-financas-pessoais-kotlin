package com.financas.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import com.financas.R
import com.financas.ui.adapter.ListaTransacoesAdapter
import com.financas.ui.model.Transacao
import kotlinx.android.synthetic.main.activity_lista_transacoes.*
import java.math.BigDecimal
import java.util.Calendar

class ListaTransasoesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)

        val transasoes: List<Transacao> = listOf(Transacao(BigDecimal(20.5), "Comida", Calendar.getInstance()),
            Transacao(BigDecimal(100.0), "Economia", Calendar.getInstance()))
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, transasoes)
        lista_transacoes_listview.setAdapter(ListaTransacoesAdapter(transasoes, this))
    }
}