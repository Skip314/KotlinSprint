package org.example.lesson_20

import org.example.lesson_7.getIntRandom


class Robot(
    val name: String,
) {

    fun say(string: String?) {

        if (string == null) {
            println(
                "$name: ${
                    when (getIntRandom(1..5).toInt()) {

                        1 -> "Привет"
                        2 -> "Меня зовут $name"
                        3 -> "Ку-ку"
                        4 -> "Тебе повезло"
                        else -> "Ты не такой как все"
                    }
                }"
            )
        }
        else println(string)
    }

    fun setModifier() {}
}

fun main() {

    val robot = Robot("Boris")

    robot.say(null)
    robot.setModifier()
}
