package org.example.lesson_15

interface Drive {

    val name: String

    fun start() = println("${name} начал движение")
    fun finish() = println("${name} закончил движение")
    fun load(outsideCargo: Int): Int
    fun unload() = println("${name} начал разгрузку")
    fun transportation(cargoTrans: Int)
}

class Car(
    override val name: String,
    var passenger: Int = 0,
    val maxPassenger: Int = 3,
) : Drive {

    override fun load(outsideCargo: Int): Int {
        if (outsideCargo > maxPassenger) passenger = maxPassenger
        else passenger = outsideCargo
        println("$name загрузил $passenger груза")
        return outsideCargo
    }

    override fun unload() {
        super.unload()
        println("$name разгрузил $passenger пассажира")
        passenger = 0
    }

    override fun transportation(cargoTrans: Int) {

        var balance = cargoTrans

        while (balance != 0) {
            load(balance)
            start()
            finish()
            balance -= passenger
            unload()
            println("Осталось $balance пассажиров")
            println()
        }
    }
}

class Truck(
    override val name: String,
    var cargo: Int = 0,
    var maxCargo: Int = 2,
) : Drive {

    override fun load(outsideCargo: Int): Int {
        if (outsideCargo > maxCargo) cargo = maxCargo
        else cargo = outsideCargo
        println("$name загрузил $cargo груза")
        return outsideCargo
    }

    override fun unload() {
        super.unload()
        println("$name разгрузил $cargo груза")
        cargo = 0
    }

    override fun transportation(cargoTrans: Int) {

        var balance = cargoTrans

        while (balance != 0) {
            load(balance)
            start()
            finish()
            balance -= cargo
            unload()
            println("Осталось $balance груза")
            println()
        }
    }
}

fun main() {

    val cargo = 2
    val passenger = 6

    val car = Car("Mazda")
    car.transportation(passenger)

    val truck = Truck("Volvo")
    truck.transportation(cargo)
}