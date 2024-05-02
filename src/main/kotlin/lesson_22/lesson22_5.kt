package org.example.lesson_22

data class GalacticGuide(
    val name: String,
    val description: String,
    val date: String,
    val distance: Float,
) {
    fun component_1() = name
    fun component_2() = description
    fun component_3() = date
    fun component_4() = distance


}

fun main() {

    val guide = GalacticGuide("Альфа Центавра", "Ближайшая к Земле звёздная система", "1 января 2024", 4.37f)

    println("Название: ${guide.component_1()}")
    println("Описание: ${guide.component_2()}")
    println("Дата: ${guide.component_3()}")
    println("Дистанция: ${guide.component_4()}")
}

