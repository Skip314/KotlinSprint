package org.example.lesson_4

fun main() {

    println("Укажите поврежден ли корабль (true/false)")
    val isDamaged = readln()

    println("Введите колличество экипажа")
    val worker = readln()

    println("Укажите количество ящиков провизии")
    val cargo = readln()

    println("Укажите погоду (true/false)")
    val isWeatherGood = readln()

    val rangeBoardWorker = 55 .. 70
    val perfectQuantityWorker = 70


    val permission = (isDamaged.toBoolean() == false && worker.toInt() in rangeBoardWorker && cargo.toInt() > MIN_BOARDS_PROVISION) ||
            (worker.toInt() == perfectQuantityWorker && isWeatherGood.toBoolean() == true && cargo.toInt() > MIN_BOARDS_PROVISION)

    println("Корабль может отправляться в плавание :$permission")
}
const val MIN_BOARDS_PROVISION = 50
