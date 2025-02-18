package com.codecraf.androidmaster

fun main() {
    val child = 5
    val adult = 28
    val senior = 87
    val isMonday = true
    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    when(age){
        in 1..12 -> return age
        in 13..60 -> if (isMonday){
            return age
        }
        in 61..100-> return age
        in -1..-1000-> println("numero no valido")
    }
    return age
}