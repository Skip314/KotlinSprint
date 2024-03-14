package org.example.lesson_7

fun main() {

    println("Введите количество секунд:")
    val sec = readln().toInt()

    val range = 0..sec - 1

    for (i in range) {

        println("Осталось ${sec - i} секунд")
        Thread.sleep(1000)

    }

    println("Время вышло")

}