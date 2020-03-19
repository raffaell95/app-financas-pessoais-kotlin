package com.financas.ui.model

import java.math.BigDecimal
import java.util.Calendar

class Transacao(valor: BigDecimal,
                categoria: String,
                data: Calendar) {


    val valor: BigDecimal = valor
    private val categoria: String = categoria
    private val data: Calendar = data

}