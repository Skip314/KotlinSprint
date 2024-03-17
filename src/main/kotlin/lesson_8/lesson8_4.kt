package org.example.lesson_8

fun main() {

    val arrayOfIngridient = arrayOf("огурец", "помидор", "фета")
    println(printArray(arrayOfIngridient))

    print("Введите ингридиент, который вы хотели бы заменить: ")
    val inputSearchIngridient = readln()

    val search = arrayOfIngridient.indexOf(inputSearchIngridient)

    if (search < 0) {

        println("Такого ингридиента нет")
        return
    }

    print("Какой ингридиент вы хотите добавить: ")
    val inputNewIngridient = readln()

    arrayOfIngridient.set(search, inputNewIngridient)
    println("Готово! Вы сохранили следующий список:")
    printArray(arrayOfIngridient)
}

fun printArray(array: Array<String>) {

    for (i in array)
        print("|$i| ")
}
