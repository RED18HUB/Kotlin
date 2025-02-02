package com.codecraf.androidmaster

fun main(){
    getMonth(4)
    getTrimester(3)
    getSemester(4)
    resultado(4)

}

fun getMonth(month:Int){
    when(month){
        1 -> print("Eero")
        2 -> print("F")
        3 -> print("M")
        4 -> print("A")
        5 -> print("MAY")
        6 -> print("JUNIO")
        7 -> print("JULIO")
        8 -> print("AGOSTO")
        9 -> print("S")
        10 -> print("O")
        11 -> print("N")
        12 -> {
            print("D")
            println("ejemplo ")
        }
        else -> println("No es un mes valido")

    }
}

fun getTrimester(month: Int){
    when(month)
    {
        1,2,3 -> println("primer semestre")
        4,5,6 -> println("segundo semestre")
        7,8,9 -> println("tercero semestre")
        10,11,12 -> println("cuarto semestre")
    }
}
fun getSemester(month: Int) = when(month)
    {
        in 1..6 -> print ("primer semestre")
        in 7..12 -> print ("segundo semestre")
        !in 1..12 -> print ("numero no valido")
       else -> println("qwqeqweqweq")
    }



fun resultado(value:Any){
    when(value){
        is Int -> value + value
        is String -> print(value)
        is Boolean -> if(value) print("holiwi")
    }
}