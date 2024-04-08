package org.example.lesson_16

import kotlin.random.Random

class Dice() {

    private val res: Int = Random.nextInt(1, 6)

    fun printDice() = println(res)
}

fun main() {

    val role = Dice()
    role.printDice()
}