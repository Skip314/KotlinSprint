package org.example.lesson_14

open class Liner(

    val name: String,
    val speed: Int = 10,
    val cargo: Int = 200,
    val passenger: Int = 30,
    val iceBreaker: Boolean = false,
)

class IceBreakerShip(
    name: String,
) : Liner(name, speed = 8, cargo = 50, passenger = 10, iceBreaker = true)

class CargoShip(
    name: String,
    speed: Int = 9,
    cargo: Int = 500,
    passenger: Int = 15,
    iceBreaker: Boolean = false,
) : Liner(name, speed, cargo, passenger, iceBreaker)

fun main() {

    val ship1 = Liner("Legion")
    val ship2 = IceBreakerShip("Kapitan")
    val ship3 = CargoShip("Front")
}

