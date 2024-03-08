package org.example.lesson_2

import kotlin.math.pow

fun main() {

    //Формула S = P*(1+ i)n

    val cash = 70000
    val rate = 0.167
    val time = 20

    val result = cash * (1+rate).pow(time)
    println(String.format("%.3f", result))
}