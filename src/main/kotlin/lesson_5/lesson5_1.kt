package org.example.lesson_5

fun main() {

    val textAccepted = ("Добро пожаловать!")
    val textNotAccepted = ("Доступ запрещен.")

    val testNum1 = 25
    val testNum2 = 4
    val AcceptedNum = testNum1 + testNum2

    println("Решите пример $testNum1 + $testNum2")
    val result = readLine()!!.toInt()

    if (AcceptedNum == result) println(textAccepted)
    else println(textNotAccepted)

}