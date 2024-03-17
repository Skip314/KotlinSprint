package org.example.lesson_6

import kotlin.random.Random

fun main() {

    val numForTestRange = 0..9

    print("Придумайте логин: ")
    val insertLogin = readln()

    print("Придумайте пароль: ")
    val insertPassword = readln()

    println("Аккаунт $insertLogin успешно создан!")

    var attempts = 3

    do {
        print("Введите Ваш логин: ")
        val login = readln()

        print("Введите Ваш пароль: ")
        val password = readln()

        println("Докажите что вы не робот")
        val numForTest1 = numForTestRange.random()
        val numForTest2 = numForTestRange.random()
        val sum = numForTest1 + numForTest2

        print("Решите пример $numForTest1 + $numForTest2 = ")
        val inputSum = readln().toInt()

        attempts--

        if (attempts == 0) {
            println("Доступ запрещен")
            return
        }

    } while (login != insertLogin || password != insertPassword || sum != inputSum)

    println("Добро пожаловать!")
}
