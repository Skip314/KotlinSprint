package org.example.lesson_8

fun main() {

    print("Введите количество ингредиентов: ")
    val quantityIngredients = readln().toInt()
    val rangeQuantityIngredient = 1..quantityIngredients
    val arrayOfIngredients = Array(quantityIngredients) { "1" }

    var indexArray = 0

    for (i in rangeQuantityIngredient) {
        print("Введите ваш ингредиент: ")
        val inputIngredient = readln()
        arrayOfIngredients.set(indexArray, inputIngredient)
        indexArray++
    }

    printArray(arrayOfIngredients)
}

fun printArray(array: Array<String>) {

    for (i in array) print("$i| ")
}