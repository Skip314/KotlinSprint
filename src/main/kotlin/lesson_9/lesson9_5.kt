package org.example.lesson_9

import java.util.*

fun main() {

    val setIngredient = mutableSetOf<String>()

    for (i in 1..5) {
        print("Введите ингредиент №$i ")
        setIngredient.add(readln())
    }

    setIngredient.sorted()
    val firstElement = setIngredient.first()
    setIngredient.remove(setIngredient.first())

    setIngredient.add(firstElement.replaceFirstChar
    { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })

    println(setIngredient.sorted().joinToString())
}