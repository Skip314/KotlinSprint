package org.example.lesson_6

fun main() {

    println("Придумайте логин:")
    val insertLogin = readln()

    println("Придумайте пароль")
    val insertPassword = readln()

    println("Аккаунт $insertLogin успешно создан!")

    do {
        println("Введите логин")
        var login = readln()

        println("Введите пароль")
        var password = readln()

    } while (login == insertLogin && password == insertPassword)
    println("Успешно")

}