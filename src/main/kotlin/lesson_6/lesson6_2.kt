package org.example.lesson_6

fun main() {

    println("Введите количество секунд, которое надо засечь")

    val insertSecond = readln().toInt()
    var secondTimer = insertSecond

    while (secondTimer > 0) {
        secondTimer--
        println("Осталось $secondTimer секунд")
        Thread.sleep(1000)
    }
    println("Прошло $insertSecond секунд")
}