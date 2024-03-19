package org.example.lesson_9

fun main() {

    print("Введите 5 ингредиентов для блюда через \", \": ")
    val fiveIngredient = readln()

    val listOfIngredient = fiveIngredient.split(", ").toList().sorted()

    println(listOfIngredient)
}