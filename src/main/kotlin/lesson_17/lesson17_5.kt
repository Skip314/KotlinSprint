package org.example.lesson_17

class User(
    _login: String,
    _pass: String,
) {

    var login: String = _login
        set(value) {
            field = value
            println("Логин успешно изменен")
        }
    var pass: String = _pass
        get() = "*".repeat(field.length)
        set(value) {
            println("Вы не можете изменить пароль")
        }
}

fun main() {

    val user = User("admin", "0000")
    user.login = "Oleg"
    user.pass ="123"
    println(user.pass)
}