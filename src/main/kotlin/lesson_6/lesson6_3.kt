package org.example.lesson_6

fun main() {

    print("Введите количество секунд, которое надо засечь: ")

    val insertSecond = readln().toInt()
    var remSecond = insertSecond

    while (remSecond != 0) {

        println("Осталось секунд: $remSecond")
        remSecond--
        Thread.sleep(1000)
    }

    println("Время вышло")
}