package org.example.lesson_20

class User3(
    val name: String,
    var isKey: Boolean = false,
)

fun main() {

    val user = User3("Alla")
    val checkIsKey: (user: User3) -> Unit = {
        if (user.isKey) println("Игрок ${user.name} открыл дверь")
        else println("Дверь заперта")
    }

    checkIsKey(user)
}