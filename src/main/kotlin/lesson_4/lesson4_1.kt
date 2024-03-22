package org.example.lesson_4

fun main() {

    val reserveTableToday = 13
    val reserveTableTomorrow = 13 - 4

    println("Доступность столиков на сегодня: ${reserveTableToday < TABLE_IN_RESTORAN}")
    println("Доступность столиков на завтра: ${reserveTableTomorrow < TABLE_IN_RESTORAN}")
}

const val TABLE_IN_RESTORAN = 13