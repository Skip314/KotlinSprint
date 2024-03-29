package org.example.lesson_13

class Contact3(

    val name: String,
    val number: Long,
    var company: String? = null
) {

    fun printContact() {

        if (company == null) company = "<не указано>"
        println("Имя: $name, Номер: $number, Компания: $company")
    }
}

fun main() {

    val listOfContact = listOf(
        Contact3("Fedor", 8800333, "ooo fabric"),
        Contact3("Lena", 8891000),
        Contact3("Ivan", 777763),
        Contact3("Roma", 8890342, "null"),
        Contact3("Levon", 89990122, "ooo obj")
    )

    for (contact in listOfContact) {

        if (contact.company == null) contact.company = "<не указано>"
        println("Имя: ${contact.name}, Номер: ${contact.number}, Компания: ${contact.company}")
    }
}