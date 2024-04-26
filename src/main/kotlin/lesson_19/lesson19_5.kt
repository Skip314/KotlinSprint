package org.example.lesson_19

class User(
    val name: String,
    val sex: Sex,
)

enum class Sex {
    MALE,
    FEMALE,
}

fun main() {

    println("Введите имя и пол в формате м или ж")
    val cardIndex = mutableListOf<User>()

    while (cardIndex.size != 2) {

        print("Введите имя: ")
        val name = readln()
        var inputSex = ""

        while (inputSex != "м" && inputSex != "ж") {
            print("Выберите пол: м - мужской или ж - женский: ")
            inputSex = readln().lowercase()
            println(inputSex)
        }
        var sex: Sex
        if (inputSex == "м") sex = Sex.MALE
        else sex = Sex.FEMALE
        cardIndex.add(User(name, sex))
    }
    for (i in cardIndex){
        println("${i.name} ${i.sex}")
    }
}