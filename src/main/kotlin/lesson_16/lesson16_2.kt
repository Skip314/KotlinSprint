package org.example.lesson_16

private const val PI = 3.14f

class Circle(
    val radius: Int,
) {
    fun perimeter() {
        val perimeter = 2 * PI * radius
    }

    fun area() {
        val area = PI * radius * radius
    }
}

fun main() {

    val ring = Circle(12)
    ring.area()
    ring.perimeter()
}