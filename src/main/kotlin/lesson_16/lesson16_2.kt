package org.example.lesson_16

class Circle(
    val radius: Int,
) {
    private val pi = 3.14f

    fun perimeter() {
        println("Периметр окружности ${2 * pi * radius}")
    }

    fun area() {
        println("Площадь окружности ${pi * radius * radius}")
    }
}
fun main() {

    val ring = Circle(12)
    ring.area()
    ring.perimeter()

}