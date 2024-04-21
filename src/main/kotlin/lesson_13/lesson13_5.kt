package org.example.lesson_13

class Contact5(

    val name: String,
    val number: Long?,
    var company: String? = null
) {

    val listOfContact = mutableListOf<Contact5>()

    init {
        listOfContact.add(this)
    }

    fun printContact() {

        for (contact in listOfContact) {
            println("Имя: ${contact.name}, Номер: ${contact.number}, Компания: ${contact.company ?: "<не указано>"}")
        }
    }

    fun createContact() {

        try {
            val name = "Oleg"
            val number = readLine() ?: throw NumberFormatException("Неверный формат числа")
            val company = "ooo"

            val contact = Contact5(name, number.toLong(), company)
            listOfContact.add(contact)
            println()

        } catch (e: NumberFormatException) {
            println("Ошибка: ${e.message}, контакт не был создан")
        }
    }
}

fun main() {

    val contact = Contact5("Fedor", 888)
    contact.createContact()
    contact.printContact()
}