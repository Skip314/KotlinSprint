package org.example.lesson2_3

fun main() {

    val startTime = "9:39"
    val travelTime = 457

    val hourStart = startTime.substringBefore(':')

    val minuteStart = startTime.substring(startTime.lastIndexOf(':')+1)

    val finishTime: Int = hourStart.toInt() * 60 + minuteStart.toInt() + travelTime

    val finishHour = finishTime / 60
    val finishMinute = finishTime % 60

    println(String.format("%02d:%02d", finishHour, finishMinute))
}