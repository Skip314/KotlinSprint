package org.example.lesson_9

fun main() {

    val listOfIngredients = listOf("огурец", "помидор", "фета")

    println("В рецепте есть следующие ингредиенты: $listOfIngredients")

    for (i in listOfIngredients) {

        println(i)
    }
}