package br.com.digitalhouse.exercicios

fun main () {
    println(cadeia( text1 = "teste", text2 = "teste"))
}

fun cadeia (text1: String, text2: String) : Boolean {

    return if (text1 != text2) {
        false
    } else {
        true
    }
}

