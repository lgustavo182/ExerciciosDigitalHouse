package br.com.digitalhouse.exercicios

fun main () {
    println(nmPositivos())
    for (n: Int in nmPositivos()) {
        println(n)
    }
}

fun nmPositivos() : ArrayList<Int> {
    val numeros: ArrayList<Int> = arrayListOf()
    for (i: Int in 0..100) {
        numeros.add(i)
    }
    return numeros

}