package org.example.lesson2_3

fun main() {

    val startTime = "9:39"
    val travelTime = 457

    val hourStart = startTime.substringBefore(':')

    val minuteStart = startTime.substring(startTime.lastIndexOf(':') + 1)

    val finishTime: Int = hourStart.toInt() * MIN_IN_HOUR + minuteStart.toInt() + travelTime

    val finishHour = finishTime / MIN_IN_HOUR
    val finishMinute = finishTime % MIN_IN_HOUR

    println(String.format("%02d:%02d", finishHour, finishMinute))
}

const val MIN_IN_HOUR = 60