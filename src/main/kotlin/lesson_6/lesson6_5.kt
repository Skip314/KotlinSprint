package org.example.lesson_6

import kotlin.random.Random

fun main() {

    println("Придумайте логин:")
    val insertLogin = readln()

    println("Придумайте пароль")
    val insertPassword = readln()

    println("Аккаунт $insertLogin успешно создан!")

    var login: String
    var password: String

    var attempts = 3


    do {
        println("Введите логин")
        login = readln()

        println("Введите пароль")
        password = readln()

        println("Докажите что вы не робот")
        val numForTest1 = getNumTest(MIN_NUM_TEST, MAX_NUM_TEST)
        val numForTest2 = getNumTest(MIN_NUM_TEST, MAX_NUM_TEST)
        val sum = numForTest1 + numForTest2

        println("Решите пример $numForTest1 + $numForTest2 =")
        val inputSum = readln().toInt()

        attempts--
        println(attempts)

    } while (login != insertLogin && password != insertPassword && sum != inputSum && attempts > 0)

    println("Успешно")

}

fun getNumTest(minNum: Int, maxNum: Int): Int {

    return Random.nextInt(minNum, maxNum + 1)

}

const val MIN_NUM_TEST = 0
const val MAX_NUM_TEST = 9