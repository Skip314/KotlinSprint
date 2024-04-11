package org.example.lesson_14

var userId = 0
var messageId = 0

data class Chat(
    val name: String,
    val chatName: String,
) {

    val listOfMessage = mutableListOf<Message>()

    open fun addMessage(text: String) {

        val message = Message(messageId, this.name, text)

        messageId++
    }

    fun addThreadMessage() {}
}



data class User(
    val name: String,
    val userId: Int
)

data class Message(
    val messageId: Int,
    val author: String,
    val text: String,
)
