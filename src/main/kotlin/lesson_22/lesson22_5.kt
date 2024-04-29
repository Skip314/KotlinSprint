package org.example.lesson_22

data class GalacticGuide(
    val name: String,
    val description: String,
    val date: String,
    val distance: Float,
)

fun main() {

    val alphaCentauri = GalacticGuide("Alpha Centaur", "звездная система", "12.10.2148", 4.367f)
    println(alphaCentauri)
}
