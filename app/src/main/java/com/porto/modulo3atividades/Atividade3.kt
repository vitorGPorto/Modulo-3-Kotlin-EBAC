package com.porto.modulo3atividades

class Atividade3 {
}

fun main() {
        var par = 6


    println("Parte 1")
    if(par % 2 == 0){
        println("Número e par")
    }else {
        println("Número e Impar")
    }

    var impar = 5

    println("Parte 2")
    if(impar % 2 == 0){
        println("Número e par")
    }else {
        println("Número e Impar")
    }

    println("Parte 3")
    when{
        par % 2 ==0 -> println("Número e par")
        else -> println("Número e Impar")
    }

    println("Parte 4")
    when{
        impar % 2 ==0 -> println("Número e par")
        else -> println("Número e Impar")
    }
}