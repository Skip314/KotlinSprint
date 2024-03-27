package org.example.lesson_12

class weatherDayControl(

    var dayTemp: Int,
    var nightTemp: Int,
    var isOsadki: Boolean,
) {

    fun printWeather() {

        println("Температура днем: ${dayTemp}, ночью ${nightTemp}, осадки: ${isOsadki}")
    }
}

fun main() {

    val day1 = weatherDayControl(22, 11, true)

    day1.printWeather()
}
