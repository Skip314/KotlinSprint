package org.example.lesson_14

open class Liner2(

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

class IceBreakerShip2(
    name: String,
) : Liner2(name, speed = 8, cargo = 50, passenger = 10, iceBreaker = true){

    override fun download() {

        println("Ледокол $name открывает ворота со стороны кормы для погрузки")
    }
}

class CargoShip2(
    name: String,
    speed: Int = 9,
    cargo: Int = 500,
    passenger: Int = 15,
    iceBreaker: Boolean = false,
) : Liner2(name, speed, cargo, passenger, iceBreaker){

    override fun download() {

        println("Грузовой корабль $name активирует погрузочный кран для погрузки")
    }
}

fun main() {

    val ship1 = Liner2("Legion")
    ship1.download()
    ship1.showClass()

    val ship2 = IceBreakerShip2("Kapitan")
    ship2.download()
    ship2.showClass()

    val ship3 = CargoShip2("Front")
    ship3.download()
    ship3.showClass()
}

