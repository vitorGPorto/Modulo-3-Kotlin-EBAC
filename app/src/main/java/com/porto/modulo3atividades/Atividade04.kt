package com.porto.modulo3atividades

class Atividade04 {
}

fun main() {
    var array: IntArray = IntArray(40)
    var array2: IntArray = IntArray(100)

    println("Parte 1")
    for (i in array.indices) {

        println("Numero: $i")
    }

    println("Parte 2")

    var list: MutableList<Int> = mutableListOf()

    var soma = 0

    for (j in 1 .. 99){
        list.add(j)
        soma += list.indexOf(j)

        println("lista = $j")


    }
    println(" Tamanho da lista: ${list.size}")
    println("Soma: $soma")

}