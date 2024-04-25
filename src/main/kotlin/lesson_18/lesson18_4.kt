package org.example.lesson_18

open class Cube(
    val side1: Int
) {

    open fun calculateArea() {
        val area = side1 * side1 * 6
        println(area)
    }
}

class Prism(
    side1: Int,
    val side2: Int,
    val side3: Int
) : Cube(side1) {

    override fun calculateArea() {
        val area = (side1 * side2 + side2 * side3 + side1 * side3) * 2
        println(area)
    }
}

fun main() {

    val packageCube = Cube(10)
    packageCube.calculateArea()

    val packagePrism = Prism(2,5,2)
    packagePrism.calculateArea()
}