package org.example.lesson_9

fun main() {

    val setIngredient = mutableSetOf<String>()

    for (i in 1..5) {
        print("Введите ингредиент №$i ")
        setIngredient.add(readln())
    }

    setIngredient.sorted()
    val firstElement = setIngredient.first()
    setIngredient.remove(setIngredient.first())
    setIngredient.add(firstElement.capitalize())

    println(setIngredient.sorted())

}