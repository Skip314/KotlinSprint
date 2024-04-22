package org.example.lesson_14

var messageId = 0

open class Chat(
    open val name: String,
) {

    val messageList = mutableListOf<Message>()

    open fun addMessage(author: String, text: String) {


        val message = Message(messageId, author, text)
        messageList.add(message)

        messageId++
    }

    fun addThreadMessage(author: String, text: String, parentMessageId: Int) {

        val threadMessage = ChildMessage(messageId, author, text, parentMessageId)
        messageList.add(threadMessage)
        messageId++
    }

    fun printChat() {
        messageList.forEach { message ->
            print("ID: ${message.messageId}, ")
            print("Author: ${message.author}, ")
            print("Text: ${message.text} ")
            println()
        }
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
    val parentMessageId: Int
) : Message(messageId, author, text)

fun main() {

    val chat = Chat("Чат")

    val message1 = chat.addMessage("Fedor", "Hi")
    val message2 = chat.addMessage("Lena", "Hi, f")
    val thMessage1 = chat.addThreadMessage("Fedor", "my name is Fedor", 0)



    chat.printChat()
}