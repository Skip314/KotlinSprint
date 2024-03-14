package org.example.lesson_7

fun main() {

    println("Введите количество секунд:")
    val sec = readln().toInt()

    val range = sec downTo 1

    for (i in range) {

        println("Осталось $i секунд")
        Thread.sleep(1000)

    }

    println("Время вышло")

}