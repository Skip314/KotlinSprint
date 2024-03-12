package org.example.lesson_6
fun main() {

    println("Придумайте логин:")
    val insertLogin = readln()

    println("Придумайте пароль")
    val insertPassword = readln()

    println("Аккаунт $insertLogin успешно создан!")

    var login: String
    var password: String

    do {
        println("Введите логин")
        login = readln()

        println("Введите пароль")
        password = readln()

    } while (login != insertLogin && password != insertPassword)

    println("Успешно")

}