package org.example.lesson_19

enum class Fish(val name1: String) {
    GUPPY("Гуппи"),
    ANGEL_FISH("Скалярия"),
    GOLD_FISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок"),
}

fun main() {

    println("Вы можете добавить следующих рыб: ${Fish.entries.joinToString { it.name1 }}")
}