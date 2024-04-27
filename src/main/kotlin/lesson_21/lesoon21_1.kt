package org.example.lesson_21

fun main() {

    val text = "helloyi"
    println(text.vowelCount())
}

fun String.vowelCount() = this.filter { it in listOf('a', 'e', 'i', 'o', 'u', 'y') }.count()
