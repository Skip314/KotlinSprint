package org.example.lesson_13

class Contact3(

    private val name: String,
    private val number: Long,
    var company: String? = null
)

fun main() {

    val listOfContact = listOf(
        Contact3("Fedor", 8800333, "ooo fabric"),
        Contact3("Lena", 8891000),
        Contact3("Ivan", 777763),
        Contact3("Roma", 8890342, "null"),
        Contact3("Levon", 89990122, "ooo obj")
    )

    println(listOfContact.mapNotNull { it.company })
}