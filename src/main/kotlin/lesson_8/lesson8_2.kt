package org.example.lesson_8

fun main() {

    val arrayOfIngridient = arrayOf("огурец", "помидор", "фета")

    print("Введите название ингридиента для поиска: ")
    val inputNameIngridient = readln()

    for(i in arrayOfIngridient) {
        if (inputNameIngridient == i) {
            println("Ингридиент $i в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}