package org.example.lesson_6

fun main() {

    print("Введите количество секунд, которое надо засечь: ")

    var insertSecond = readln().toInt()

    while (insertSecond != 0) {

        println("Осталось секунд: $insertSecond")
        insertSecond--
        Thread.sleep(1000)
    }

    println("Время вышло")
}