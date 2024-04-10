package org.example.lesson_19

enum class Fish(val name1: String) {
    GUPPY("Гуппи"),
    ANGEL_FISH("Скалярия"),
    GOLD_FISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок"),
}

fun main() {

    val listOfFish: MutableList<String> = mutableListOf()
    listOfFish.add(Fish.GUPPY.name1)
    listOfFish.add(Fish.ANGEL_FISH.name1)
    listOfFish.add(Fish.GOLD_FISH.name1)
    listOfFish.add(Fish.SIAMESE_FIGHTING_FISH.name1)
    println(listOfFish)
}