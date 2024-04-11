package org.example.lesson_14

var userId = 0
var messageId = 0

open class Chat(
    open val name: String,
) {

    companion object {
        val mapOfMessage = mutableMapOf<Int, Message>()
    }

    open fun addMessage(text: String) {

        val message = Message(messageId, this.name, text)
        mapOfMessage[messageId] = message

        messageId++
    }

    fun addThreadMessage() {}

    fun printChat() {

        mapOfMessage.forEach { (key, value) ->
            println("id:$key ${value.author}: ${value.text}")
        }
    }
}

data class User(
    override val name: String,
) : Chat(name) {

    val id: Int = userId

    init {
        userId++
    }
}

open class Message(
    val messageId: Int,
    val author: String,
    val text: String,
)

class ChildMessage(
    messageId: Int,
    author: String,
    text: String,
    val childMessageId: Int
) : Message(messageId, author, text)

fun main() {

    val chat = Chat("Чат")

    val user1 = User("Fedor")
    user1.addMessage("Привет, я Fedor")

    val user2 = User("Oleg")
    user2.addMessage("Hi")

    chat.printChat()
}