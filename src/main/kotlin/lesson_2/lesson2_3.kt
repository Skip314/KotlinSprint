package org.example.lesson2_3

fun main() {

    val startTime = "9:39"
    val travelTime = 457
    val minInHour = 60

    val hourStart = startTime.substringBefore(':')

    val minuteStart = startTime.substring(startTime.lastIndexOf(':')+1)

    val finishTime: Int = hourStart.toInt() * minInHour + minuteStart.toInt() + travelTime

    val finishHour = finishTime / minInHour
    val finishMinute = finishTime % minInHour

    println(String.format("%02d:%02d", finishHour, finishMinute))
}