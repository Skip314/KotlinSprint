package org.example.lesson_15

val components = mutableListOf<Component>()

class Instrument(
    val name: String,
    var stock: Int,
) : Search

class Component(
    val name: String,
    var stock: Int,
    val general: Instrument,
) {

    init {
        components.add(this)
    }
}

interface Search {

    fun search() {

        println("Выполняется поиск")
        for (component in components) {
            if (component.general == this) println("${component.name} ${component.stock} штук")
        }
    }
}

fun main() {


    val hummer = Instrument("Молоток", 10)
    val handle = Component("Ручка", 2, hummer)
    val striker = Component("Бойок", 4, hummer)

    hummer.search()
}