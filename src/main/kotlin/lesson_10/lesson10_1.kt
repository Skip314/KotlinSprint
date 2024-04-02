package org.example.lesson_10

fun main() {

    print("Хотите сыграть? ")
    val answer = readln()

    if (answer.equals("да", ignoreCase = true) != true) return

    val playerResult = dropDice1()
    println("Ваш бросок = $playerResult")

    val compResult = dropDice1()
    println("Бросок компьютера = $compResult")

    when {
        playerResult > compResult -> println("Победило человечество")
        compResult > playerResult -> println("Победила машина")
        else -> println("Ничья")
    }
}

fun dropDice1(): Int {
    val rangeDice = 1..6
    return rangeDice.random()
}