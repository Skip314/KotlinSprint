package org.example.lesson_11

class Obj(
    val id: Int,
    val category: String,
    val name: String,
    val picture: String,
    val tegFavorites: Boolean = false,

){
    val recept: MutableList<String> = mutableListOf()
}
fun main() {

    val burgerMiC = Obj(
        0,"burgers","бургер с грибами и сыром","burger.png"
    )
}