package com.financas.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import com.financas.R
import com.financas.ui.adapter.ListaTransacoesAdapter
import com.financas.ui.model.Tipo
import com.financas.ui.model.Transacao
import kotlinx.android.synthetic.main.activity_lista_transacoes.*
import java.math.BigDecimal
import java.util.Calendar

class ListaTransasoesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)

        val transasoes: List<Transacao> = transacoesDeExemplo()

        configuraLista(transasoes)
    }

    private fun configuraLista(transasoes: List<Transacao>) {
        lista_transacoes_listview.adapter = ListaTransacoesAdapter(transasoes, this)
    }

    private fun transacoesDeExemplo(): List<Transacao> {
        return listOf(
            Transacao(
                valor = BigDecimal(20.5),
                tipo = Tipo.DESPESA,
                data = Calendar.getInstance()
            ),
            Transacao(
                valor = BigDecimal(100.0),
                categoria = "Economia",
                tipo = Tipo.RECEITA
            )
        )
    }
}