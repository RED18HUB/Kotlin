package com.codecraf.androidmaster

fun main(){
    val morningNotification = 51
    val eveningNotification = 135
    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int){
    when(numberOfMessages){
        in 1..99 -> println("You have $numberOfMessages notifications")
        in 10..1000 -> println("Your phone is blowing up! You have 99+ notifications.")
    }
}
