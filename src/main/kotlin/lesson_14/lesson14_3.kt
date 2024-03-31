package org.example.lesson_14

abstract class Figure(
    val color: String,
) {
    open fun getPerimeter(): Double {
        val perimeter: Double = 0.0
        print("Периметр геометрической фигуры")
        return perimeter
    }
}

class Circle(
    color: String,
    private val radius: Int,

    ) : Figure(color) {
    var perimeter: Double = 0.0

    override fun getPerimeter(): Double {
        super.getPerimeter()
        val perimeter = 2.0 * PI * radius
        print(" окружность: $perimeter")
        return perimeter
    }
}

class Rectangle(
    color: String,
    private val width: Int,
    private val height: Int,
) : Figure(color) {

    var perimeter: Double = 0.0
    override fun getPerimeter(): Double {
        super.getPerimeter()
        val perimeter: Double = width * 2.0 + height * 2
        print(" прямоугольник: $perimeter")
        return perimeter
    }
}

fun main() {
    val listOfFigure = mutableListOf<Figure>()

    val circle1 = Circle("white", 15)

    circle1.perimeter = circle1.getPerimeter()
    listOfFigure.add(circle1)

    val rectangle1 = Rectangle("white", 12, 13)
    rectangle1.perimeter = rectangle1.getPerimeter()

    println("${circle1.color}, ${circle1.perimeter}")
}

const val PI = 3.14
