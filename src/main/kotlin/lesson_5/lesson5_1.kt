package org.example.lesson_5

fun main() {

    val textAccepted = ("Добро пожаловать!")
    val textNotAccepted = ("Доступ запрещен.")

    val testNum1 = 25
    val testNum2 = 4
    val AcceptedNum = testNum1 + testNum2

    print("Решите пример $testNum1 + $testNum2 = ")
    val result = readln().toInt()

    if (AcceptedNum == result) println(textAccepted)
    else println(textNotAccepted)

}