package org.example.lesson_13

class Contact2(

    val name: String,
    val number: Long,
) {
    var company: String? = null

    constructor(
        name: String,
        number: Long,
        company: String,
    ) : this(name, number) {

        this.company = company
    }

    fun printContact() {

        if (company == null) company = "<не указано>"
        println("Имя: $name, Номер: $number, Компания: $company")
    }
}

fun main() {

    val contact1 = Contact2("Fedor", 8800333, "ooo fabric")
    val contact2 = Contact2("Lena", 8891000)

    contact1.printContact()
    contact2.printContact()
}