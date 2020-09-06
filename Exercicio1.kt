package br.com.digitalhouse.exercicios

fun main () {
    println(maiorNumero(nm1 = 1, nm2 = 2, nm3 = 3))
}

fun maiorNumero (nm1: Int, nm2: Int, nm3: Int) : Int {

    return if (nm1>nm2 && nm1>nm3) {
        nm1
    } else if (nm2 > nm3) {
        nm2
    }
    else {
        nm3
    }
}

