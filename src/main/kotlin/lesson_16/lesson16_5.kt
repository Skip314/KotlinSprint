package org.example.lesson_16

import kotlin.properties.Delegates

class Player(
    val name: String,
    var health: Int = 100,
    var force: Int = 10,
) {

    private fun death() {

        println("Персонаж $name, погиб")
        force = 0
        health = 0
    }

    fun damage(damage: Int) {

        println("Персонаж $name, получает урон $damage")
        health -= damage
        if (health < 0) death()
    }

    fun healing(heal: Int) {

        if (health <= 0) {

            println("Персонаж $name, погиб и не может быть вылечен")
            return
        }

        println("Персонаж $name, лечит $heal здоровья")
        health += heal
        if (health > 100) health = 100
    }
}

fun main() {

    val player = Player("Robot")
    player.damage(10)
    player.healing(15)
    player.damage(110)
}