package br.com.digitalhouse.exercicios

fun main () {
    println(analise(nm1 = 10, nm2 = 20, nm3 = 30, nm4 = 4))
}

fun analise (nm1: Int, nm2: Int, nm3: Int, nm4: Int) : Boolean {
    return if ((nm1 > nm3 && nm1 > nm4) || (nm2 > nm3 && nm2 > nm4)) {
        true
    } else {
        false
    }
}
