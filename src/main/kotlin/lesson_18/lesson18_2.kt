package org.example.lesson_18

open class Dice4(
    open val quantity: Int = 4,
) {
    open fun dropDice() {
        val value = (1..quantity).random()
        println(value)
    }
}

class Dice6(
    override val quantity: Int = 6,
) : Dice4(quantity)

class Dice8(
    override val quantity: Int = 8,
) : Dice4(quantity)

fun main() {

    val dice4 = Dice4()
    val dice6 = Dice6()
    val dice8 = Dice8()

    val listOfDice: List<Dice4> = listOf(dice4, dice6, dice8)

    for (dice in listOfDice) dice.dropDice()
}
