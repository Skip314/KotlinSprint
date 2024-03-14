package org.example.lesson_2

import kotlin.math.pow

fun main() {

    val cash = 70000
    val rate = 16.7
    val time = 20

    val result = cash * (1 + rate / 100).pow(time)
    println(String.format("%.3f", result))
}