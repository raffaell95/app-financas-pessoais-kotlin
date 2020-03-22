package com.financas.ui.extention

fun String.limitaEmAte(caracteres: Int): String {
    if (this.length > caracteres) {
        val primeiroCarecter = 0
        return "${this.substring(primeiroCarecter, caracteres)}..."
    }
    return this
}