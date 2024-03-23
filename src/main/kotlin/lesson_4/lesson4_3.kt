package org.example.lesson_4

fun main() {

    val isWeatherToday: Boolean = true
    val isOpenTent: Boolean = true
    val air: Int = 20
    val season: String = "winter"

    println(
        """
        Благоприятные ли условия сейчас для роста бобовых?
        ${isWeatherToday == IS_WEATHER_TODAY && isOpenTent == IS_OPEN_TENT && air == WET_AIR && season != NOT_A_SEASON}
        """.trimIndent()
    )

}

const val IS_WEATHER_TODAY = true
const val IS_OPEN_TENT = true
const val WET_AIR = 20
const val NOT_A_SEASON = "winter"
