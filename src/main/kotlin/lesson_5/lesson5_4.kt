package org.example.lesson_5

fun main() {

    val login = "Zaphod"
    val password = "PanGalactic"

    println("Вdедите ваш логин")
    val inputLogin = readLine().toString()

    if(login == inputLogin) {
        println("Введите ваш пароль")
        val inputPassword = readLine().toString()
        if(inputPassword == password) println("Пользователь $inputLogin, вам разрешено входить на борт " +
                "корабля \"Heart of Gold\"")
    }
    else println("Пользователя $inputLogin не существует, пройдите регистрацию нового пользователя")

}