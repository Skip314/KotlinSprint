package org.example.lesson_15

var id = 0
var messageId = 0

open class Forum3(
    val name: String,
    val userId: Int,
) {

    companion object {
        val members = mutableMapOf<Int, User1>()
        val messageMap = mutableMapOf<Int, Message>()
    }


    fun addMember(member: User1) {

        members[member.userId] = member
        id ++
    }

    open fun addMessage(text: String, msId: Int = messageId) {

        val message = Message(this.name, msId, text)
        messageMap[message.msId] = message
        messageId ++
    }

    fun showListOfMember(){

        println("Список участников:")
        members.values.forEach { member ->
            println("ID: ${member.userId}, Name: ${member.name}")
        }
        println()
    }

    fun showListOfMessage(){

        messageMap.values.forEach { message ->
            println("Автор: ${message.name} ID: ${message.msId}, Message: ${message.message}")
            println()
        }
    }
}

object CreateUser {

    fun createUser(name: String, userId: Int = id): User1 = User1(name, userId)
    fun createAdmin(name: String, userId: Int = id): Admin1 = Admin1(name, userId)
}

object CreateMessage {

    fun createMessage(msId: Int = messageId + 1, message: String, name: String): Message = Message(name, msId, message)
}

open class User1(
    name: String,
    userId: Int,
) : Forum3(name, userId) {

}

class Admin1(
    name: String,
    userId: Int,
) : User1(name, userId) {

    fun delMessage(id: Int) {

        println("Сообщение ${messageMap[id]} удалено")// не получается дать нормальный вывод
        messageMap.remove(id)
    }

    fun delUser(id: Int) {

        println("Участник ${members[id]} удален")
        members.remove(id)
    }
}

class Message(
    val name: String,
    val msId: Int,
    val message: String,
)

fun main() {

    val forum = Forum3("Forum",0)

    val user = CreateUser.createUser("Fedor")
    forum.addMember(user)
    user.addMessage("Hi")

    val user1 = CreateUser.createUser("Sunny")
    forum.addMember(user1)
    user1.addMessage("City")

    val admin = CreateUser.createAdmin("admin")
    forum.addMember(admin)
    admin.addMessage("Admin is hear")

    forum.showListOfMember()

    forum.showListOfMessage()
    admin.delMessage(0)
    forum.showListOfMessage()

    admin.delUser(0)
    forum.showListOfMember()
}