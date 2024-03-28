package org.example.lesson_12

class weatherDayLs3(

    dayTemp: Int,
    nightTemp: Int,
    isOsadki: Boolean,
) {
    var dayTemp = dayTemp - TRANSLATE_KELVIN
    var nightTemp = nightTemp - TRANSLATE_KELVIN
    var isOsadki = isOsadki

    init {
        println("Температура днем: ${dayTemp}, ночью ${nightTemp}, осадки: ${isOsadki}")

    }
}

fun main() {

    val day1 = weatherDayLs3(300, 280, true)
}

const val TRANSLATE_KELVIN = 273