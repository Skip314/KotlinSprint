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


}
fun readName(): String {
    print("Введите имя: ")
    return readln()
}

fun readSex(): Sex {
    print("Выберите пол: м - мужской или ж - женский: ")
    var setSex = readln().lowercase()
    var sex: Sex? = null
    when (setSex) {
        "м" -> sex = Sex.MALE
        "ж" -> sex = Sex.FEMALE
        else -> {
            print("Выберите пол: м - мужской или ж - женский: ")
            setSex = readln()
        }
    }
    return sex!!
}

