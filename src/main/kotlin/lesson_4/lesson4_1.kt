package org.example.lesson_4

fun main() {

    val table = 13
    val reserveTableToday = 13
    val reserveTableTomorrow = 13 - 4

    println("Доступность столиков на сегодня: ${reserveTableToday < table}")
    println("Доступность столиков на завтра: ${reserveTableTomorrow < table}")
}