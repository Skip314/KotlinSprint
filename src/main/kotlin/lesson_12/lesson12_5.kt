package org.example.lesson_12

import org.example.lesson_7.getIntRandom

class WeatherDayLs5(
    val dayTemp: Int,
    val nightTemp: Int,
    val isOsadki: Boolean,
) {
    val listOfWeatherDay: MutableList<Int> = mutableListOf()
    val listOfWeatherNight: MutableList<Int> = mutableListOf()
    val listOfWeatherRain: MutableList<Boolean> = mutableListOf()

    val tempRange = -30..50

    fun generateWeatherOfMonth() {

        for (i in 1..DAY_IN_MONTH) {

            listOfWeatherDay.add(tempRange.random())
            listOfWeatherNight.add(tempRange.random())
            listOfWeatherRain.add(java.util.Random().nextBoolean())
        }
    }

    fun getMidNumList(list: List<Int>): Int {

        var midNum = list.sum() / DAY_IN_MONTH
        return midNum
    }
}

fun main() {

    val day1 = WeatherDayLs5(10, 12, false)

    day1.generateWeatherOfMonth()

    println("Средняя ночная температура в месяце: ${day1.getMidNumList(day1.listOfWeatherDay)}")
    println("Средняя ночная температура в месяце: ${day1.getMidNumList(day1.listOfWeatherNight)}")
    println("Колличество дней с осадками: ${day1.listOfWeatherRain.count { it }}")
}

const val DAY_IN_MONTH = 30