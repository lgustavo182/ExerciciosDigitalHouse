package br.com.digitalhouse.exercicios

fun main() {
    println (parImpar(nm=15))
}

fun parImpar (nm: Int): Boolean {
    return if (nm%2 != 0 ) {
        false
    } else {
        true
    }
}