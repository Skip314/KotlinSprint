package org.example.lesson_14

var messageId = 0

open class Chat(
    open val name: String,
) {

    val messageList = mutableListOf<Message>()
    val childMessage = mutableListOf<ChildMessage>()

    open fun addMessage(author: String, text: String) {


        val message = Message(messageId, author, text)
        messageList.add(message)

        messageId++
    }

    fun addThreadMessage(author: String, text: String, parentMessageId: Int) {

        childMessage.add(ChildMessage(messageId, author, text, parentMessageId))
        childMessage.groupBy { it.parentMessageId }

        messageId++
    }

    fun printChat() {
        messageList.forEach { message ->
            println("ID: ${message.messageId}, Author: ${message.author}, Text: ${message.text}")
            val childMessages = childMessage.filter { it.parentMessageId == message.messageId }
            if (childMessages.isNotEmpty()) {
                println("Thread:")
                childMessages.forEach { child ->
                    println("  - ${child.text}")
                }
            }
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

    val message0 = chat.addMessage("Fedor", "Hi")
    val message1 = chat.addMessage("Lena", "Hi, F")
    val message2 = chat.addMessage("Vlad", "text")
    val thMessage01 = chat.addThreadMessage("Fedor", "my name is Fedor", 0)
    val thMessage02 = chat.addThreadMessage("Fedor", "in London", 0)

    chat.printChat()
}