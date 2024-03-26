package org.example.lesson_9

fun main() {

    val listOfIngredient = mutableListOf("яйца", "молоко", "сливочного масла")

    val listOfValue = mutableListOf(2, 50, 15)

    print("Введите количество порций: ")
    val quantity = readln().toInt()

    val listOfValueQuantity = listOfValue.map { it * quantity }

    println("На $quantity порций вам понадобится : ${listOfIngredient.zip(listOfValueQuantity)}")

}