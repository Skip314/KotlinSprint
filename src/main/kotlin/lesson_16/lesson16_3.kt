package org.example.lesson_16

class User(
    val login: String,
    private val pass: String,
) {

    fun valid(inputPass: String): Boolean {
        return inputPass == this.pass
    }
}

fun main() {

    val user = User("admin", "123")
    print("Введите пароль: ")
    val inputPass = readln()
    println("Введенный пароль: ${user.valid(inputPass)}")
}