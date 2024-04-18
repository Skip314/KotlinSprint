package org.example.lesson_16

class User(
    val login: String,
    private val pass: String,
) {

    fun valid() {
        val inputPass = readln()
        println(inputPass == this.pass)
    }
}

fun main() {

    val user = User("admin", "123")
    user.valid()
}