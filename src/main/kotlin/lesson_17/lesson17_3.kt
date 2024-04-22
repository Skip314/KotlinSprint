package org.example.lesson_17

class Folder(
    name: String,
    quantity: Int,
    val isSecret: Boolean = true
) {
    var name = "Root"
        get() = if (isSecret) "Секретная папка" else field

    var quantity = 2
        get() = if (isSecret) 0 else field

}

fun main() {

    val fold = Folder("Rood", 2, false)
    println(fold.name)
    println(fold.quantity)
    println()

    val fold2 = Folder("Root", 2)
    println(fold2.name)
    println(fold2.quantity)
}