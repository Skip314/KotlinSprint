package org.example.lesson_17

class Folder(
    _name: String,
    _quantity: Int,
    val isSecret: Boolean = true
) {
    var name = _name
        get() = if (isSecret) "Секретная папка" else field

    var quantity = _quantity
        get() = if (isSecret) 0 else field

}

fun main() {

    val fold = Folder("Good", 4, false)
    println(fold.name)
    println(fold.quantity)
    println()

    val fold2 = Folder("Moot", 2)
    println(fold2.name)
    println(fold2.quantity)
}