package org.example.lesson_12

class WeatherDayLs3(

    dayTemp: Int,
    nightTemp: Int,
    isRain: Boolean,
) {
    var dayTemp = dayTemp - TRANSLATE_KELVIN1
    var nightTemp = nightTemp - TRANSLATE_KELVIN1
    var isRain = isRain

    fun printWeather() {

        println("Температура днем: ${dayTemp}, ночью ${nightTemp}, осадки: ${isRain}")
    }
}

fun main() {

    val day1 = WeatherDayLs3(300, 280, true)
    day1.printWeather()
}

const val TRANSLATE_KELVIN1: Int = 273