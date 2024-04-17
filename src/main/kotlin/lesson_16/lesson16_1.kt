package org.example.lesson_16

class Dice() {

    private val res: Int = (1..6).random()

    fun printDice() = println("На кубике выпало $res")
}

fun main() {

    val role = Dice()
    role.printDice()
}