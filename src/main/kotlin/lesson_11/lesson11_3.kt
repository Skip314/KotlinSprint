package org.example.lesson_11


class Room(
    val cover: String,
    val name: String,
    var listOfMember: MutableList<Member>,
) {
    fun addMember() {

        println("Добавить в комнату участника: ")
        val inputMember = readln()

        listOfMember.add(inputMember)

    }

    fun editStatus() {

        println()
    }
}

class Member(

    val name: String,
    val avatar: String,
    val status: String,
) {
    fun printMember() {

        println(name)
        println(avatar)
        println(status)
    }

}

fun main() {

    val listOfMemberInRoom1 = mutableListOf<Member>()
    var room1 = Room("Программист", "Котлин", listOfMemberInRoom1)
    var member1 = Member("Vlad", ":|", "разговаривает")
    var member2 = Member("Ivan", ";)", "пользователь заглушен")

    listOfMemberInRoom1.add(member1)
    listOfMemberInRoom1.add(member2)
    println(listOfMemberInRoom1)
}