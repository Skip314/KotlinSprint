package org.example.lesson_21

import java.io.File

fun main() {

    val file = File("text.txt")
    file.entry("Start")
}

fun File.entry(text: String) = this.writeText(text.lowercase())