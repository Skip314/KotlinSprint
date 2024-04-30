package org.example.lesson_22

data class GalacticGuide(
    val name: String,
    val description: String,
    val date: String,
    val distance: Float,
)

fun main() {

    val alphaCentauri = GalacticGuide("Alpha Centaur", "звездная система", "12.10.2148", 4.367f)

    println("Название места или события: ${alphaCentauri.name}")
    println("Описание места или события: ${alphaCentauri.description}")
    println("Дата и время события: ${alphaCentauri.date}")
    println("Расстояние места или события от Земли в световых годах: ${alphaCentauri.distance}")
}
