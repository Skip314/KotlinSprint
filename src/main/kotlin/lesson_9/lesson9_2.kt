package org.example.lesson_9

fun main() {

    val listOfIngredients = mutableListOf("огурец", "помидор", "фета")
    println(listOfIngredients)

    print("Желаете добавить еще? ")
    val inputAnsver = readln()
    if (inputAnsver.equals("да", ignoreCase = true))
        else return

    print("Какой ингредиент вы хотите добавить? ")
    listOfIngredients.add(readln())

    println("Теперь в рецепте есть следующие ингредиенты: $listOfIngredients")
}