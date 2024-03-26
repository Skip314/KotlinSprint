package org.example.lesson_8

fun main() {

    val arrayOfIngridient = arrayOf("огурец", "помидор", "фета")

    print("Введите ингридиент для поиска: ")
    val inputIngredientSearch = readLine()

    val searching = arrayOfIngridient.indexOf(inputIngredientSearch)

    if (searching >= 0) {
        println("Ингридиент $inputIngredientSearch в списке есть")
    } else println("Такого ингридиента в списке нет")


}