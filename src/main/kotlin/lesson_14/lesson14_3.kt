package org.example.lesson_14

abstract class Figure(
    val color: String,
) {

    open fun countPerimeter() {}
    open fun countArea() {}
}

class Circle(
    color: String,
    private val radius: Int,

    ) : Figure(color) {

    var perimeter: Double = 0.0
    var area: Double = 0.0

    override fun countPerimeter() {
        perimeter = 2.0 * PI * radius
    }

    override fun countArea() {
        area = PI * radius * radius
    }

    init {
        countArea()
        countPerimeter()
    }
}

class Rectangle(
    color: String,
    private val width: Int,
    private val height: Int,
) : Figure(color) {

    var perimeter: Double = 0.0
    var area: Double = 0.0

    override fun countPerimeter() {
        perimeter = width * 2.0 + height * 2.0
    }

    override fun countArea() {
        area = (width * height).toDouble()
    }

    init {
        countArea()
        countPerimeter()
    }
}

fun main() {

    val listOfFigure: MutableList<Any> = mutableListOf()

    val circle1 = Circle("white", 15)
    listOfFigure.add(circle1)

    val circle2 = Circle("black", 3)
    listOfFigure.add(circle2)

    val rectangle1 = Rectangle("white", 12, 13)
    listOfFigure.add(rectangle1)

    val rectangle2 = Rectangle("black", 2, 4)
    listOfFigure.add(rectangle2)

    var sumPerimeterBlackFigure = 0.0
    var sumAreaWhiteFigure = 0.0


    for (i in listOfFigure) {
        when (i) {
            is Circle -> if (i.color == "black") sumPerimeterBlackFigure += i.area
            is Rectangle -> if (i.color == "black") sumPerimeterBlackFigure += i.area
        }
    }

    for (i in listOfFigure) {
        when (i) {
            is Circle -> if (i.color == "white") sumAreaWhiteFigure += i.area
            is Rectangle -> if (i.color == "white") sumAreaWhiteFigure += i.area
        }
    }

    println("Сумма периметров всех черных фигур: $sumPerimeterBlackFigure")
    println("Сумма площадей всех белых фигур: $sumAreaWhiteFigure")
}

const val PI = 3.14