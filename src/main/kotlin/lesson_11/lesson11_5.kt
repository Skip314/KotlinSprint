package org.example.lesson_11

import javax.sound.midi.MetaMessage

class Forum(

    //понятия не имею зачем он
)

class User5(

    var userId: Int,
    var userName: String,
) {
    fun createNewUser(id: Int): User5 {

        print("Введите имя нового пользователя: ")
        var i = id
        val name = readln()
        val user1 = User5(id, name)
        return user1
    }
}

class MessageForum(

    val authorId: Int,
    val message: String,
){
    fun createNewMessage(id: Int){

        println("для создания сообщения введите ваш id: ")
        val inputId = readln().toInt()
        if(id <= inputId) return

        print("Ваше сообщение: ")
        val inputMessage = readln()
        val message: MessageForum(inputId, inputMessage)
    }
}

fun main() {

    var id = 0

    val user1 = User5(0, "")
    user1.createNewUser(id)
    id ++

    val user2 = User5(0,"")
    user2.createNewUser(id)
    id ++

    println("${user1.userId}, ${user1.userName}")
    println("${user2.userId}, ${user2.userName}")
}