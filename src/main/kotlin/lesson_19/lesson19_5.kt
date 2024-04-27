package org.example.lesson_19

class User(
    val name: String,
    val sex: Sex,
)


enum class Sex(val nameSex: String) {
    MALE("муж"),
    FEMALE("жен"),
}

fun main() {

    println("Введите имя и пол в формате м или ж")
    val cardIndex = mutableListOf<User>()

    for (i in 1..QUANTITY_USER) {
        cardIndex.add(User(readName(), readSex()))
    }

    for (i in cardIndex) println("${i.name} - ${i.sex.nameSex}")

}

fun readName(): String {
    print("Введите имя: ")
    return readln()
}

fun readSex(): Sex {

    var sex: Sex? = null
    while (sex == null) {
        print("Выберите пол: м - мужской или ж - женский: ")
        var setSex = readln().lowercase()
        when (setSex) {
            "м" -> sex = Sex.MALE
            "ж" -> sex = Sex.FEMALE
            else -> sex = null
        }
    }
    return sex!!
}

const val QUANTITY_USER = 5

