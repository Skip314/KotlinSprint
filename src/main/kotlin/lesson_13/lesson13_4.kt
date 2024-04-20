package org.example.lesson_13

class Contact4(

    val name: String,
    val number: Long,
    var company: String? = null
) {

    val listOfContact = mutableListOf<Contact4>()

    init {
        listOfContact.add(this)
    }

    fun printContact() {

        for (contact in listOfContact) {
            println("Имя: ${contact.name}, Номер: ${contact.number}, Компания: ${contact.company ?: "<не указано>"}")
        }
    }

    fun createContact() {

        print("Введите имя контакта: ")
        val name = readln()
        print("Введите номер контакта: ")
        val number = readln().toLongOrNull()
        if (number == null) {
            println("Вы не ввели номер, контакт не был создан")
            println()
            return
        }
        print("Введите компанию контакта: ")
        var company: String? = readln()
        if (company == "") company = null

        val contact = Contact4(name, number, company)
        listOfContact.add(contact)
        println()
    }
}

fun main() {

    val contact = Contact4("Fedor", 888)
    contact.createContact()
    contact.printContact()
}