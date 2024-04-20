package org.example.lesson_17

class Ship{
    var name: String
        get() = "БОБЕДА"
        set(value) = println("Нельзя менять имя корабля")
    val speed: Int = 10
    val port: String = "port1"
}
fun main(){

    val ship1 = Ship()
    ship1.name = "БЕДА"
    println(ship1.name)
}