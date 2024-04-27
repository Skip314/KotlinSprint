package org.example.lesson_21

class Player(
    val name: String,
    var health: Int,
    val maxHealth: Int = 100,
)

fun main() {

    val player = Player("admin", 100)
    println(player.isHealThy())
}

fun Player.isHealThy(): Boolean {
    if (this.health == maxHealth)
        return true
    else return false
}