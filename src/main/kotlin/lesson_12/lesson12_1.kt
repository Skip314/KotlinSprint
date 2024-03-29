package org.example.lesson_12

class WeatherDay() {

    var dayTemp = 0
    var nightTemp = 0
    var isRain = false

    fun printWeather() {

        println("Температура днем: ${dayTemp}, ночью ${nightTemp}, осадки: ${isRain}")
    }
}

fun main() {

    val day1 = WeatherDay()
    day1.dayTemp = 24
    day1.nightTemp = 11
    day1.isRain = true

    val day2 = WeatherDay()
    day2.dayTemp = 16
    day2.nightTemp = 0
    day2.isRain = false

    day1.dayTemp = 22

    day1.printWeather()
    day2.printWeather()
}