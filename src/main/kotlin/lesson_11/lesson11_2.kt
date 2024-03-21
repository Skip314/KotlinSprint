package org.example.lesson_11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "",
) {
    fun printUser() = println("$id, $login, $password, $email, $bio")

    fun saveBio() {
        print("Введите информацию о себе: ")
        bio = readln()
    }

    fun changPass() {
        print("Введите пароль: ")
        val inputPass = readln()
        if (inputPass == password) {
            print("Введите новый паррль: ")
            password = readln()
            println("Ваш пароль изменен")
        }
    }
}

fun main() {

    val user1 = User2(0, "Vlad", "123", "11@mail.ru")

    user1.saveBio()
    user1.changPass()
    user1.printUser()
}