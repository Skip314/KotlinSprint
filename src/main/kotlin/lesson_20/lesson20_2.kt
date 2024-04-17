package org.example.lesson_20

class User2(
    val name: String,
    var health: Int,
    val maxHealth: Int = 100,
)

fun main() {

    val user = User2("player", 64)

    val healingPotion: (user: User2) -> Unit = { user.health = user.maxHealth }

    healingPotion(user)
}