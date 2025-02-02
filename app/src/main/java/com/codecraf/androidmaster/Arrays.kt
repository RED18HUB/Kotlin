package com.codecraf.androidmaster

fun main(){
    /* secuencias de datos,*/
    var weekDays= arrayOf("L","M","M","J","V","S","D")
   weekDays[0]="Holita"
    println(weekDays[0])

    if(weekDays.size>=8){
        println(weekDays[7])}
    else{
        println("No hay mas valores en el arrya")
    }

    for (day in weekDays){
        println(day)
    }

    for (day1 in weekDays.indices){
        println(weekDays[day1])
    }
    for ((day,value) in weekDays.withIndex()){
        println("la posicion $day contiene $value")
    }





}