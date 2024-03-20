package org.example.lesson_10

fun main() {

    val token = logIn()
    if (token == null) return
    println(showCart(token))
}

fun showCart(token: String) {

    val cart = listOf("огурец", "помидор", "фета")
    if (token.length == 32) {
        println("Товары в вашей корзине : ${cart.joinToString(", ")}")
    }else return
}

fun logIn(): String? {

    print("Введите логин: ")
    val login = readln()

    print("Введите пароль: ")
    val password = readln()

    if (login == LOGIN && password == PASSWORD) {

        println("Успешная авторизация")
        val token = createToken()
        return token
    } else {
        println("Не удалось авторизироваться")
        return null
    }
}

fun createToken(): String {

    val numRange = 0..9
    val strRange = 'a'..'z'
    val token = mutableListOf<String>()

    val randomSimvolRange = 0..1
    val forRange = 1..LENGTH_TOKEN

    for (i in forRange) {

        if (randomSimvolRange.random() == 0) {

            token.add(numRange.random().toString())
        } else token.add(strRange.random().toString())
    }
    return token.joinToString("")
}

const val LOGIN = "Vlad"
const val PASSWORD = "123"
const val LENGTH_TOKEN = 32