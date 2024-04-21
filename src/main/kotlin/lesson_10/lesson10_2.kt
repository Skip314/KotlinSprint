package org.example.lesson_10

fun main() {

    print("Придумайте логин: ")
    val login = readln()

    print("Придумайте пароль: ")
    val pas = readln()

    if (checkLength(login) && checkLength(pas)) {
        println("Добро пожаловать!")
        return
    } else println("Логин или пароль недостаточно длинные")
}

fun checkLength(obj: String): Boolean = obj.length >= 4
