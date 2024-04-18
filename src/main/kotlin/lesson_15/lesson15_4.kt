package org.example.lesson_15


abstract class Item(
    open val name: String,
    open var stock: Int,
) {
    val components = mutableListOf<Component>()

}

class Instrument(
    override val name: String,
    override var stock: Int,
) : Search, Item(name, stock) {

    override fun search() {

        println()
        println("Выполняется поиск")
        for (component in components) {
            if (component.general == this) println("${component.name} ${component.stock} шт.")
        }
    }
}

class Component(
    override val name: String,
    override var stock: Int,
    val general: Instrument,
) : Item(name, stock) {

    init {
        components.add(this)
    }
}

interface Search {

    fun search() {}
}

fun main() {


    val hummer = Instrument("Молоток", 10)
    val handle = Component("Ручка", 2, hummer)
    val striker = Component("Бойок", 4, hummer)
    hummer.search()

    val car = Instrument("Машина", 2)
    val motor = Component("Двигатель", 1, car)
    val door = Component("Дверь", 2, car)
    car.search()
}