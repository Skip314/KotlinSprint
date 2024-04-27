package org.example.lesson_19

class Panzer(
    val name: String,
    var ammo: Ammunition? = null,
) {

    fun shoot() {

        println("$name нанес ${ammo?.damage} урона")
    }
}

enum class Ammunition(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

fun main() {

    val tank = Panzer("Tank")
    tank.ammo = Ammunition.GREEN
    tank.shoot()

    tank.ammo = Ammunition.RED
    tank.shoot()

    tank.ammo = Ammunition.BLUE
    tank.shoot()
}