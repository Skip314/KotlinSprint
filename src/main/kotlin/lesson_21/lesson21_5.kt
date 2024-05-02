package org.example.lesson_21

fun main() {

    val skill = mutableMapOf("sneak" to 3, "builder" to 5, "miner" to 5)
    println(skill.maxCategory())
}

fun Map<String, Int>.maxCategory(): String? = this.maxByOrNull { it.value }?.key