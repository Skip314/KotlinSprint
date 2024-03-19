package org.example.lesson_11

//для участников надо создавать отдельный класс?
//или достаточно листа? если да, то все данные хранить в одном элементе?
//нужно ли имя участнику?
//где взять аватарку и тем более, как вывести информацию при нажатии на нее в консоли?

class Room(
    val cover: String,
    val name: String,
    var listOfMember: MutableList<String?>,
) {
    fun addMember() {
        println("Добавить участника в комнату ")
        print("(аватар, статус(“разговаривает”, “микрофон выключен”, “пользователь заглушен”)): ")
        listOfMember.add(readln())
    }

    fun editStatus() {
        println()
    }
}

fun main() {

    val room1 = Room("Программист","Котлин", mutableListOf(":), разговаривает"))

}