package org.example.lesson_4

fun main() {

    print("Укажите поврежден ли корабль (true/false) ")
    val isDamaged = readln().toBoolean()

    print("Введите колличество экипажа: ")
    val worker = readln().toInt()

    print("Укажите количество ящиков провизии: ")
    val cargo = readln().toInt()

    print("Укажите погоду (true/false) ")
    val isWeatherGood = readln().toBoolean()

    val rangeBoardWorker = 55..70

    val permission = (isDamaged == BOARD_DAMAGED && worker in rangeBoardWorker && cargo > MIN_BOARDS_PROVISION) ||
            (worker == GOOD_QUANTITY_WORKER && isWeatherGood == WEATHER_GOOD && cargo > MIN_BOARDS_PROVISION)

    println("Корабль может отправляться в плавание :$permission")
}

const val MIN_BOARDS_PROVISION = 50
const val WEATHER_GOOD = true
const val BOARD_DAMAGED = false
const val GOOD_QUANTITY_WORKER = 70