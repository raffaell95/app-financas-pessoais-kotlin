package com.financas.ui.extention

import java.text.SimpleDateFormat
import java.util.Calendar

fun Calendar.formataBrasileiro(): String{
    val formatoBrasileiro = "dd/MM/YYYY"
    val format = SimpleDateFormat(formatoBrasileiro)
    return format.format(this.time)

}

