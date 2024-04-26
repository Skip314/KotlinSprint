package org.example.lesson_19

class Chattel(val name: String) {

    fun takeoff() {
        println("Космический корабль $name взлетает")
    }

    fun landing() {
        //TODO создать метод
    }

    fun shootingAsteroid() {
        TODO()
    }
}

fun main() {

    val chattel = Chattel("Star")
    chattel.takeoff()
    chattel.landing()
    chattel.shootingAsteroid()
}