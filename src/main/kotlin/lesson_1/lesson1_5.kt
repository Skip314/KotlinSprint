package org.example.lesson_1

fun main() {

    val secondInSpase: Short = 6480

    val hour: Int = secondInSpase / SEC_IN_HOUR
    val minute: Int = secondInSpase / MIN_IN_HOUR - hour * MIN_IN_HOUR
    val second: Int = secondInSpase % MIN_IN_HOUR

    println(String.format("%02d:%02d:%02d", hour, minute, second))

}
const val MIN_IN_HOUR = 60
const val SEC_IN_HOUR = 3600