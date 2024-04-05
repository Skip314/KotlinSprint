package org.example.lesson_15

abstract class Unit1(
    val name: String,
    val isAdmin: Boolean,
) {

    companion object {
        var userMap = mutableMapOf<Int, User>()
        var messageMap = mutableMapOf<Int, String>()
        var messageId = 0
    }

    open fun readMessage() {

    }
}

class User(
    name: String,
    isAdmin: Boolean = false,
) : Unit1(name, isAdmin) {

    val userId: Int

    init {

        userId = nextId++
        userMap[userId] = this
    }

    companion object {

        private var nextId = 0
    }

    fun printMap() {

        userMap.forEach { (key, value) -> println("ID: $key, name: ${value.name}, admin?: ${value.isAdmin}") }
    }

    fun delUser(id: Int) {
        if (!isAdmin) return

        userMap.remove(id)
        println("Unit $id is del")
    }

    fun message() {

        val message = "Hi"
        println(message)
        messageMap[messageId] = message
        messageId++
    }
}

fun main() {

    val admin1 = User("admin", true)

    val user1 = User("Ivan")

    val user2 = User("Anton")

    val user3 = User("Alan")

    admin1.printMap()
}
