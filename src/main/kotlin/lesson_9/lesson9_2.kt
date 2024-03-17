package org.example.lesson_9

fun main() {

    val listOfIngredients = mutableListOf("огурец", "помидор", "фета")
    println(listOfIngredients)

    print("Желаете добавить еще? ")
    val inputAnsver = readln()
    if (inputAnsver != "да") return

    print("Какой ингредиент вы хотите добавить? ")
    val inputIngredient = readln()

    listOfIngredients.add(inputIngredient)

    println("Теперь в рецепте есть следующие ингредиенты: $listOfIngredients")
}