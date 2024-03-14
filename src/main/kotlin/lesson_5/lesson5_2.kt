package org.example.lesson_5

fun main() {

    println("Введите ваш год рождения")
    val birthYear = readln().toInt()

    val todayYear = 2024

    if((todayYear - birthYear) >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")

}

const val AGE_OF_MAJORITY = 18