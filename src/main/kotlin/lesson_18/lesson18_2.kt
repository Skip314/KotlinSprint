package org.example.lesson_18

open class Dice4(
    val quantity: Int = 4,
) {
    fun dropDice() {
        val value = (1..quantity).random()
    }
}

class Dice6(
    val quantity: Int = 6,
)

class Dice8(
    val quantity: Int = 8,
)