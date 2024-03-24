package org.example.lesson_7

fun main() {

    val code = (1000..9999).random()

    do {

        println("Ваш код авторизации: $code")
        print("Введите код: ")
        val inputCode = readln().toInt()

    } while (code != inputCode)

    println("Добро пожаловать!")
}