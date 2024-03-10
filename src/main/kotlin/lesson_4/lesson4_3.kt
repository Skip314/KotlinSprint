package org.example.lesson_4

fun main() {

    val weatherToday: String = "sun"
    val openTent: Boolean = true
    val air: Int = 20
    val season: String = "winter"

    println("""
        Благоприятные ли условия сейчас для роста бобовых?
        ${weatherToday == "sun" && openTent == true && air == 20 && season != "winter"}
        """.trimIndent())

}