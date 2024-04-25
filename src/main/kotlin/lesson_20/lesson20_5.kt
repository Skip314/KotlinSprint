package org.example.lesson_20

class Robot(
    val name: String,
    private var modifier: (String) -> String = { it }
) {

    private val phrase =
        listOf("Привет", "Меня зовут $name", "Ку-ку", "Тебе повезло", "Ты не такой как все")

    fun say() {
        val randomString = phrase.random()
        println(modifier(randomString))
    }

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }
}

fun main() {

    val robot = Robot("Boris")

    robot.say()
    robot.setModifier { str: String ->
        str.reversed()
    }
    robot.say()
}