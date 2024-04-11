package org.example.lesson_9

import org.example.lesson_7.getStringRandom
import java.util.*

fun main() {

    val ingredientsSet = mutableSetOf<String>()

    for (i in 1..5) {
        print("Введите ингредиент №$i ")
        ingredientsSet.add(readln())
    }

    val ingredients = ingredientsSet.sorted().toTypedArray()
    ingredients[0] = ingredients[0].replaceFirstChar { it.uppercaseChar() }
    println(ingredients.contentToString())

}