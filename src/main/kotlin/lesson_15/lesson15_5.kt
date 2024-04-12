package org.example.lesson_15

interface Movable {

    val name: String

    fun move() = println("$name начал движение\n$name приехал")
}

interface CargoTrans {

    val name: String

    fun cargoTrans(allCargo: Int)
}

interface PassengerTrans {

    val name: String

    fun passengerTrans(allPassenger: Int)
}

class Car(
    override val name: String,
    private var passenger: Int = 0,
    private val maxPassenger: Int = 3,
) : Movable, PassengerTrans {

    override fun passengerTrans(allPassenger: Int) {

        var balance = allPassenger

        while (balance != 0) {

            move()

            passenger = if (balance > maxPassenger) maxPassenger
            else balance
            balance -= passenger
            println("$name перевез $passenger груза")
            println()
        }
    }
}

class Truck(
    override val name: String,
    private var cargo: Int = 0,
    private var maxCargo: Int = 2,
) : Movable, CargoTrans {

    override fun cargoTrans(allCargo: Int) {

        var balance = allCargo

        while (balance != 0) {

            move()

            cargo = if (balance > maxCargo) maxCargo
            else balance
            balance -= cargo
            println("$name перевез $cargo груза")
            println()
        }
    }
}

fun main() {

    val cargo = 2
    val passenger = 6

    val car = Car("Mazda")
    car.passengerTrans(passenger)

    val truck = Truck("Volvo")
    truck.cargoTrans(cargo)
}