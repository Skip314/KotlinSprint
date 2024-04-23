package org.example.lesson_20

fun main() {

    val elementsList = mutableListOf("элемент1", "эелмент2", "элемент3", "элемент4")

    val lambdaList = elementsList.map { element -> { println("Нажат элемент: $element") } }

    lambdaList.forEachIndexed { index, lambda ->
        if (index % 2 == 0) {
            lambda()
        }
    }
}