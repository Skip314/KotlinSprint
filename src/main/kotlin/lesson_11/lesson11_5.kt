package org.example.lesson_11

import javax.sound.midi.MetaMessage

class Forum(

) {
    var lastId = 0
    val listOfUser = mutableListOf<User5>()
    val listOfMessage = mutableListOf<MessageForum>()

    fun createNewUser(name: String, id: Int = lastId) {

        listOfUser.add(User5(id, name))
        println("Создан пользователь $name создан с id: $lastId")
        listOfMessage.add(MessageForum(lastId, "Привет, меня зовут $name"))
        lastId++
    }

    fun printUser() {

        for (i in listOfUser)
            println("${i.userName}, id: ${i.userId}")
    }

    fun createNewMessage(userId: Int, message: String) {

        if (listOfUser.find { it.userId == userId } == null) return
        listOfMessage.add(MessageForum(userId, message))
    }

    fun printThread() {

        for (i in listOfMessage) {
            val name = listOfUser.find { it.userId == i.authorId }
            if (name != null) {
                println("${name.userName} : ${i.message}")
            }
        }
    }
}

class User5(

    var userId: Int,
    var userName: String,
)

class MessageForum(

    val authorId: Int,
    val message: String,
)

fun main() {

    val forum = Forum()

    forum.createNewUser("Ivan")
    forum.createNewMessage(0,"Hi")

    forum.createNewUser("Vlad")
    forum.createNewMessage(1, "My name is Vlad")

    forum.createNewMessage(0, "ok")

    forum.createNewUser("Fedor")
    forum.createNewMessage(2, "I am Fedor")
    forum.printThread()
}