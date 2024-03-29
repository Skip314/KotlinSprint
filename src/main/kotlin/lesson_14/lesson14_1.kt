package org.example.lesson_14

open class Liner(

    val name: String,
    val speed: Int = 10,
    val cargo: Int = 200,
    val passenger: Int = 30,
    val iceBreaker: Boolean = false,
){
    open fun download() {

        println("Лайнер $name выдвигает горизонтальный трап со шкафута для погрузки")
    }

    fun showClass(){

        println("Название корабля: $name, скорость: $speed, грузоподъёмность: " +
                "$cargo, пассажировместимость: $passenger, ледокол: $iceBreaker")
        println()
    }
}

class IceBreakerShip(
    name: String,
) : Liner(name, speed = 8, cargo = 50, passenger = 10, iceBreaker = true){

    override fun download() {

        println("Ледокол $name открывает ворота со стороны кормы для погрузки")
    }
}

class CargoShip(
    name: String,
    speed: Int = 9,
    cargo: Int = 500,
    passenger: Int = 15,
    iceBreaker: Boolean = false,
) : Liner(name, speed, cargo, passenger, iceBreaker){

    override fun download() {

        println("Грузовой корабль $name активирует погрузочный кран для погрузки")
    }
}

fun main() {

    val ship1 = Liner("Legion")
    ship1.download()
    ship1.showClass()

    val ship2 = IceBreakerShip("Kapitan")
    ship2.download()
    ship2.showClass()

    val ship3 = CargoShip("Front")
    ship3.download()
    ship3.showClass()
}

