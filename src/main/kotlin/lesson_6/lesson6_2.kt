package org.example.lesson_6

fun main() {

    println("Введите количество секунд, которое надо засечь")

    val insertSecond = readln().toLong()

    Thread.sleep(insertSecond * MILLIS_IN_SECOND)

    println("Прошло секунд: $insertSecond ")
}

const val MILLIS_IN_SECOND = 1000