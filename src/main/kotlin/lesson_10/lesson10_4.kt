package org.example.lesson_10

fun main() {

    print("Желаете сыграть в кости?: ")
    val answer = readln()
    if (answer != "да") return
    else println("Вы выйграли ${play()} раз")
}

fun dropDice(): Int {

    val range = 1..6
    return range.random()
}

fun play(): Int {

    var vinRate = 0
    do {
        val playerResult = dropDice()
        println("Ваш бросок :$playerResult")

        val compResult = dropDice()
        println("Бросок компьютера: $compResult")

        when {
            playerResult > compResult -> {
                println("Победило человечество")
                vinRate++
            }

            compResult > playerResult -> println("Победила машина")
            else -> println("Ничья")
        }
        println()
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        val finishAnswer = readln()

    } while (finishAnswer == "да")

    return vinRate
}