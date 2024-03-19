package org.example.lesson_11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
) {
    fun printUser() {
        println("$id, $login, $password, $email")
    }
}

fun main() {

    val user1 = User(0, "Vlad", "123", "11@mail.ru")
    val user2 = User(1, "Ivan", "321", "i@mail.ru")

    user1.printUser()
    user2.printUser()

}
