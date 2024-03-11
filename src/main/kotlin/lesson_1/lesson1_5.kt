package org.example.lesson_1

fun main() {

    val secondInSpase: Short = 6480
    val minInHour = 60
    val secInHour = 3600

    val hour: Int = secondInSpase / secInHour
    val minute: Int = secondInSpase / minInHour - hour * minInHour
    val second: Int = secondInSpase % minInHour

    println(String.format("%02d:%02d:%02d", hour, minute, second))

}