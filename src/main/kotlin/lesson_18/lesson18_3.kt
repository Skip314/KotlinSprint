package org.example.lesson_18

open class Fox(
    val name: String = "Лиса",
    val eat: String = "ягоды",
) {

    fun eating() {
        println("$name ест $eat")
    }
}

class Dog(
    name: String = "Собака",
    eat: String = "кости"
) : Fox(name, eat)

class Cat(
    name: String = "Кошка",
    eat: String = "рыба"
): Fox(name, eat)

fun main() {

    val fox = Fox()
    val dog = Dog()
    val cat = Cat()

    val animals: List<Fox> = listOf(fox,dog,cat)
    for (animal in animals) animal.eating()
}