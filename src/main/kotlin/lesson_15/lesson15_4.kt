package org.example.lesson_15


abstract class Item(
    open val name: String,
    open var stock: Int,
)
class Instrument(
    override val name: String,
    override var stock: Int,
) : Search, Item(name, stock) {

    override fun search() {

        println()
        println("Выполняется поиск")
        }
    }
}

class Component(
    override val name: String,
    override var stock: Int,
    val general: Instrument,
) : Item(name, stock)

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