package org.example.lesson_8

fun main() {

    val arrayOfIngridient = arrayOf("огурец", "помидор", "фета")

    print("Введите название ингридиента для поиска: ")
    val inputNameIngridient = readln()

    for(ingredient in arrayOfIngridient) {
        if (inputNameIngridient == ingredient) {
            println("Ингридиент $ingredient в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}