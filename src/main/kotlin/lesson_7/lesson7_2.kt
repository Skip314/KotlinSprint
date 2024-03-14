package org.example.lesson_7

fun main() {

    val range = 1000..9999

    do{

        val code = range.random()
        println("Ваш код авторизации: $code")
        print("Введите код:")
        val inputCode = readln().toInt()

    } while (code != inputCode)

    println("Добро пожаловать!")
}