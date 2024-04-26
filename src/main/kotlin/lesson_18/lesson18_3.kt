package org.example.lesson_18

open class Fox(
    val name: String = "Лиса",
    val food: String = "ягоды",
) {

    fun eating() {
        println("$name -> ест $food")
    }

    fun slipping() {
        println("$name -> спит")
    }
}

class Dog(
    name: String = "Собака",
    food: String = "кости"
) : Fox(name, food)

class Cat(
    name: String = "Кошка",
    food: String = "рыба"
) : Fox(name, food)

fun main() {

    val fox = Fox()
    val dog = Dog()
    val cat = Cat()

    val animals: List<Fox> = listOf(fox, dog, cat)
    for (animal in animals) animal.eating()
}