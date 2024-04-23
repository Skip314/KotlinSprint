package org.example.lesson_20

import org.example.lesson_7.getIntRandom

class Robot(
    val name: String,
) {

    var isModifier = false

    fun say() {

        val phrase: () -> String = {

            when (getIntRandom(1..5).toInt()) {

                1 -> "Привет"
                2 -> "Меня зовут $name"
                3 -> "Ку-ку"
                4 -> "Тебе повезло"
                else -> "Ты не такой как все"
            }
        }
        if (isModifier) println("$name: ${phrase().reversed()}")
        else println("$name: ${phrase()}")
    }

    fun setModifier(mod: () -> Unit) {
        mod()
    }
}

fun main() {

    val robot = Robot("Boris")

    robot.say()
    robot.setModifier { robot.isModifier = true }
    robot.say()
}
