package org.example.lesson_21

fun main() {

    val skill = mutableMapOf("sneak" to 5, "builder" to 5, "miner" to 5)
    println(skill.maxCategory())
}

fun Map<String, Int>.maxCategory(): String? {

    val maxSkill = maxOf() { it.value }
    return this.entries.shuffled().find { it.value == maxSkill }?.key
}