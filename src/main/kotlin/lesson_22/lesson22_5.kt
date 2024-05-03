package org.example.lesson_22

data class GalacticGuide(
    val name: String,
    val description: String,
    val date: String,
    val distance: Float,
)

fun main() {

    val guide = GalacticGuide("Альфа Центавра", "Ближайшая к Земле звёздная система", "1 января 2024", 4.37f)

    println("Название: ${guide.component1()}")
    println("Описание: ${guide.component2()}")
    println("Дата: ${guide.component3()}")
    println("Дистанция: ${guide.component4()}")
}

