package com.codecraf.androidmaster
var age:Int=30
var age2:Int=56
val example:Long=546885
fun main(){
    varibalesNumericas()
    add(15,10)
    showMyName("jonas")
    val mySubstract = substract(10,5)
    println(mySubstract)
    // poner la f para decir que es de tipo float
    val floatDecimal:Float=30.1f
    val doubleNumero:Double=55.97
   //Char
    val charExample1:Char='q'
    var charExample2:Char='2'
    val charExample4:Char='@'
    //STRING
    val stringExample:String="1"
    val stringExample2:String="2"
    val stringExample3:String="3"
    //Boolean
    val booleanExample:Boolean=true
    val booleanExample2:Boolean=false
    var stringConcatenada:String="HOLA"

}
fun varibalesNumericas(){

    println(age)
}
fun showMyAge(){
    println("mi edad es ")
}
fun add(firstNumber:Int, seconNumber:Int){
    println(firstNumber + seconNumber)

}

fun showMyName(name:String){
    println("Mi nombre es $name")
}
fun substract(firstNUmber:Int, secondNUmber:Int):Int{
    return firstNUmber-secondNUmber


}