package org.example.lesson_21

fun main() {

    val listNum = listOf(1, 2, 3, 4, 5, 6)
    println(listNum.evenNumbersSum())
}

fun List<Int>.evenNumbersSum() = this.filter { it % 2 == 0 }.sum()