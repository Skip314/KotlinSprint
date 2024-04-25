package org.example.lesson_18

class Screen{

    fun draw(obj: Point) {
        print("Объект $obj")
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

    screen.draw(point.createObj(1,3))
}