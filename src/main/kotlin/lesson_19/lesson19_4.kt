package org.example.lesson_19

class Panzer(
    val name: String,
    var ammo: Ammunition? = null,
) {
    fun shoot() {

        val damage = when(ammo) {
            Ammunition.BLUE -> 5
            Ammunition.GREEN -> 10
            Ammunition.RED -> 20
            null -> 0
        }
        println("$name нанес $damage урона")
    }
}

enum class Ammunition{
    BLUE,
    GREEN,
    RED,
}

fun main() {

    val tank = Panzer("Tank")
    tank.ammo = Ammunition.GREEN
    tank.shoot()

    tank.ammo = Ammunition.RED
    tank.shoot()
}