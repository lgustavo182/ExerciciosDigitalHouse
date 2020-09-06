package br.com.digitalhouse.exercicios

fun main () {
    println(primeiroPositivoImpar())

    for (numero: Int in primeiroPositivoImpar()) {
        println(numero)
    }


}
fun primeiroPositivoImpar(): ArrayList<Int> {
    val numeros: ArrayList<Int> = arrayListOf<Int>()
    for (i: Int in 0..100) {
        if(i>0 && i%2 != 0) {
            numeros.add(i)
        }
    }
    return numeros
}


