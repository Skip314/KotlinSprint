package org.example.lesson_21

fun main() {

    val text = "hello"
    text.vowelCount()
}

fun String.vowelCount() {

    val charList = listOf('a', 'e', 'i', 'j', 'o', 'u', 'y')
    var count = 0
    for (char in this) if (char in charList) count++
    println(count)
}