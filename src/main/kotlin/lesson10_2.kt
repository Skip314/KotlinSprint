package org.example

import kotlin.math.log

fun main() {

    print("Придумайте логин: ")
    val login = readln()

    print("Придумайте пароль: ")
    val pas = readln()

    if (checkLength(login)&& checkLength(pas) == true) {
        println("Добро пожаловать!")
        return
    }else println("Логин или пароль недостаточно длинные")
}

fun checkLength(obj: String): Boolean = obj.length >= 4
