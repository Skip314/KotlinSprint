package org.example.lesson_10

fun main() {

    print("Хотите сыграть? ")
    val answer = readln()

    if (answer != "да") return

    val playerResult = dropDice()
    println("Ваш бросок = $playerResult")

    val compResult = dropDice()
    println("Бросок компьютера = $compResult")

    when {
        playerResult > compResult -> println("Победило человечество")
        compResult > playerResult -> println("Победила машина")
        else -> println("Ничья")
    }
}

fun dropDice(): Int {
    val rangeDice = 1..6
    return rangeDice.random()
}