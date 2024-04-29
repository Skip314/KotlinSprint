package org.example.lesson_19

class User(
    val name: String,
    val sex: Sex,
)


enum class Sex(val nameSex: String) {
    MALE("муж"),
    FEMALE("жен"),
    ERROR("ошибка")
}

fun main() {

    println("Введите имя и пол в формате м или ж")
    val cardIndex = mutableListOf<User>()

    for (i in 1..QUANTITY_USER) {
        val sex = readSex()
        if (sex == Sex.ERROR) println(Sex.ERROR.nameSex)
        else cardIndex.add(User(readName(), readSex()))
    }

    for (i in cardIndex) println("${i.name} - ${i.sex.nameSex}")

}

fun readName(): String {
    print("Введите имя: ")
    return readln()
}

fun readSex(): Sex {

    var sex: Sex? = null
    print("Выберите пол: м - мужской или ж - женский: ")
    val setSex = readln().lowercase()
    sex = when (setSex) {
        "м" -> Sex.MALE
        "ж" -> Sex.FEMALE
        else -> Sex.ERROR
    }

    return sex
}

const val QUANTITY_USER = 5

