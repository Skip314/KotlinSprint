package org.example.lesson_8

fun main() {

    print("Введите количество ингредиентов: ")
    val quantityIngredients = readln().toInt()

    val arrayOfIngredients = Array(quantityIngredients) { "" }

    for (i in 1..quantityIngredients) {
        print("Введите ваш ингредиент: ")
        val inputIngredient = readln()
        arrayOfIngredients[i-1] = inputIngredient
    }

    //printArray(arrayOfIngredients)
}

//fun printArray(array: Array<String>) {

    //for (i in array) print("$i| ")
//}