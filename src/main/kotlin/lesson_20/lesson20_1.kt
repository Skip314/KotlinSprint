package org.example.lesson_20

fun main() {

    val userName = "Valera"

    val greeting: () -> Unit = { println("С наступающим Новым Годом, $userName!")}
    greeting()
}