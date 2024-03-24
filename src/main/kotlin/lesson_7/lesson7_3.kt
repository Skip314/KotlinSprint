package org.example.lesson_7

fun main() {

    println("Введите число")

    val inputNum = readln()
    val num = inputNum.toInt()

    val range = 0..num step 2

    for (i in range) println(i)
}