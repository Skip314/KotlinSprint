package org.example.lesson_12

class Weather(
    val dayTemp: Int,
    val nightTemp: Int,
    val precipitation: Boolean,
)
fun main() {

    val firstDay = Weather(17, 2, false)
    val secondDay = Weather(11, 0, true)


}