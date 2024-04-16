package org.example.lesson_20

fun main() {

    val userName = "Valera"

    val greeting: () -> String = { "С наступающим Новым Годом, $userName!" }
    println(greeting())
}