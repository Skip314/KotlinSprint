package org.example.lesson_12

class weatherDayLs3(

    dayTemp: Int,
    nightTemp: Int,
    isOsadki: Boolean,
) {
    var dayTemp = dayTemp
    var nightTemp = nightTemp
    var isOsadki = isOsadki

    fun printWeather() {

        println("Температура днем: ${dayTemp - 273}, ночью ${nightTemp - 273}, осадки: ${isOsadki}")
    }
}

fun main() {

    val day1 = weatherDayLs3(300, 280, true)
    day1.printWeather()
}