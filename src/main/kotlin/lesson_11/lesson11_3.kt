package org.example.lesson_11


class Room(
    val cover: String,
    val name: String,
) {

    val listOfMember: MutableList<Member> = mutableListOf()
    fun addMember() {

        println("Добавить в комнату участника")
        print("Введите имя: ")
        val inputName = readln()
        print("Введите аватар: ")
        val inputAvatar = readln()
        val status = selectStatus()
        val member = Member(inputName, inputAvatar, status)
        listOfMember.add(member)
    }

    fun selectStatus():String {

        print("Выберите статус: “разговаривает” - 1, “микрофон выключен” - 2, “пользователь заглушен” - 3 ")
        var inputStatus: String = readln()
        when (inputStatus) {
            "1" -> inputStatus = "разговаривает"
            "2" -> inputStatus = "микрофон выключен"
            "3" -> inputStatus = "пользователь заглушен"
            else -> {
                print("Выбор не верен, попробуйте еще раз: “разговаривает” - 1, “микрофон выключен” - 2, “пользователь заглушен” - 3: ")
                inputStatus = readln()
            }
        }

        return inputStatus
    }

    fun editStatus() {

        print("Введите ваше имя")
        val inputName = readln()
        val member = listOfMember.find { it.name == inputName }
        if (member != null) member.status = selectStatus()

    }

    fun printMember(room: Room) {

        println("В комнате ${room.name} следующие участники:")
        for (member in listOfMember) {

            println("Аватар: ${member.avatar} , Имя: ${member.name} , Статус: ${member.status}")
        }
    }
}

class Member(

    val name: String,
    val avatar: String,
    var status: String,
) {
    fun printMember() {

        println(name)
        println(avatar)
        println(status)
    }
}

fun main() {

    val room = Room("Picture", "Kotlin")

    val member1 = Member("Vlad",":)","разговаривает")
    room.listOfMember.add(member1)

    room.printMember(room)

    room.addMember()

    room.editStatus()

    room.printMember(room)
}