package org.example.lesson_18

class Screen {

    fun draw(obj: Point, x: Int, y: Int) {
        obj.createObj(x, y)
    }

    fun draw(obj: Ring, x: Int, y: Int) {
        obj.createObj(x, y)
    }

    fun draw(obj: Square, x: Int, y: Int) {
        obj.createObj(x, y)
    }

    fun draw(obj: Point, x: Float, y: Float) {
        obj.createObj(x, y)
    }

    fun draw(obj: Ring, x: Float, y: Float) {
        obj.createObj(x, y)
    }

    fun draw(obj: Square, x: Float, y: Float) {
        obj.createObj(x, y)
    }
}

open class Point(
    val name: String = "точка",
) {

    fun createObj(x: Int, y: Int) {
        println("Объект $name с координатами x = $x, y = $y создан")
    }

    fun createObj(x: Float, y: Float) {
        println("Объект $name с координатами x = $x, y = $y создан")
    }
}

class Ring(
    name: String = "окружность",
) : Point(name)

class Square(
    name: String = "квадрат",
) : Point(name)


fun main() {

    val screen = Screen()
    val point = Point()
    val ring = Ring()
    val square = Square()

    screen.draw(point, 1, 3)
    screen.draw(square, 12.4f, 3.3f)
}