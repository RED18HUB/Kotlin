package com.codecraf.androidmaster

fun main(){
    inmutableList()
    mutableList()
}
fun mutableList(){
    var weekDays:MutableList<String> = mutableListOf("L","M","M","J","V","S","D")
    println(weekDays)
    weekDays.add(0,"Lemon")
    println(weekDays)

    if (weekDays.isEmpty()){
        println("vacio")
    }
    else{
        weekDays.forEach { days -> println(days) }
    }
    println( weekDays.last())

    for (day in weekDays){
        println(day)
    }



}
fun inmutableList(){
    val readOnly:List<String> = listOf("L","M","M","J","V","S","D")//lista inmutable
    println(readOnly.size)
    println(readOnly.toString())
    println(readOnly[0])
    println(readOnly.last())

    val example=readOnly.filter { it.contains("m") }
    println(example)

    readOnly.forEach{weekDay -> println(weekDay)}

}