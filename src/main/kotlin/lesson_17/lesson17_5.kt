package org.example.lesson_17

class User {

    var login: String = "admin"
        set(value) {
            field
            println("Логин успешно изменен")
        }
    var pass: String = "123"
        get() = { pass.length * "*" }.toString()
        set(value) {
            println("Вы не можете изменить пароль")
        }
}

fun main() {

    val user = User()
    user.login = "Oleg"
    user.pass ="1234"
    println(user.pass)
}