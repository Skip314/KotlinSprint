package org.example.lesson_21

fun main() {

    val listNum = listOf(1, 2, 3, 4, 5, 6)
    listNum.evenNumbersSum()
}

fun List<Int>.evenNumbersSum() {

    var sum = 0
    for (num in this) {
        if (num % 2 == 0) sum += num
    }
    println(sum)
}