package org.example.lesson_12

class weatherDay() {

    var dayTemp = 0
    var nightTemp = 0
    var isOsadki = false

    fun printWeather() {

        println("Температура днем: ${dayTemp}, ночью ${nightTemp}, осадки: ${isOsadki}")
    }
}


fun main() {

    val day1 = weatherDay()
    day1.dayTemp = 24
    day1.nightTemp = 11
    day1.isOsadki = true

    val day2 = weatherDay()
    day2.dayTemp = 16
    day2.nightTemp = 0
    day2.isOsadki = false

    day1.dayTemp = 22

    day1.printWeather()
    day2.printWeather()
}