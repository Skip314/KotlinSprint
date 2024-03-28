package org.example.lesson_12

class WeatherDayControl(

    var dayTemp: Int,
    var nightTemp: Int,
    var isRain: Boolean,
) {

    fun printWeather() {

        println("Температура днем: ${dayTemp}, ночью ${nightTemp}, осадки: ${isRain}")
    }
}

fun main() {

    val day1 = WeatherDayControl(22, 11, true)

    day1.printWeather()
}
