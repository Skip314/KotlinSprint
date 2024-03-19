package org.example.lesson_11

class Obj(
    val id: Int,
    val category: String,
    val name: String,
    val picture: String,
    val recept: List<String>,
    val tegFavorites: Boolean = false

)
fun main() {

    val burgerMiC = Obj(
        0,"burgers","бургер с грибами и сыром","burger.png", listOf("Творог - 350г")
    )
}