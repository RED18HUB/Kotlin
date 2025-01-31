package com.codecraf.androidmaster

fun main(){
    ifBasico()
    ifAnidado()
    ifBoolean()
    ifInt()
    ifMultiple()
    ifMultipleOr()
}
/* if Basico */
fun ifBasico(){
    val name="Dario"
    if(name == "Dario") println("es verdaadero")
    else println("es falso")
}
/* if anidado */
fun ifAnidado(){
    val animal="Perro"
    if(animal=="Gato")
    {
        println("es un gato")
    }
    else if(animal == "oveja"){
        println("es mamifero")
    }
    else{
        println("no es ninguno")
    }
}

fun ifBoolean(){
    var soyFeliz:Boolean=true
    if(!soyFeliz)
    {
        println("es mentira")
    }
}
fun ifInt(){
    var age=18
    if(age>28)
    {
        println("puedo beber cerveza")
    }
}
fun ifMultiple(){
    var age=18
    var parentPermission=false
    var imHappy=true
    if((age>17) && (imHappy)){
        println("es verdader")
    }
}

fun ifMultipleOr(){
    var pet = "cat"
    var isHappy=true
    if(pet=="dog" || (pet=="cat" && isHappy)){
        println("esttoy feliz")
    }
}