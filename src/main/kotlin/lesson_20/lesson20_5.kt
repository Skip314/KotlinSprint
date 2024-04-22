package org.example.lesson_20

import org.example.lesson_7.getIntRandom

class Robot(
    val name: String,
) {

    private var isModifier = false

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
        if (isModifier) println(phrase().reversed())
        else println(phrase())
    }

    fun setModifier(mod: Boolean) {
        isModifier = mod
    }
}

fun main() {

    val robot = Robot("Boris")

    robot.say()
    robot.setModifier(true)
    robot.say()

}
