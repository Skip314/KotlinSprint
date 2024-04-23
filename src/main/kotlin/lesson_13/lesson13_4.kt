package org.example.lesson_13

class Contact4(

    val name: String,
    val number: Long,
    var company: String? = null
) {

    fun printContact(listOfContact: MutableList<Contact4>) {

        for (contact in listOfContact) {
            println("Имя: ${contact.name}, Номер: ${contact.number}, Компания: ${contact.company ?: "<не указано>"}")
        }
    }

    fun createContact(): Contact4? {

        print("Введите имя контакта: ")
        val name = readln()
        print("Введите номер контакта: ")
        val number = readln().toLongOrNull()

        if (number == null) {
            println("Вы не ввели номер, контакт не был создан")
            println()
            return null
        } else {
            print("Введите компанию контакта: ")
            var company: String? = readln()
            if (company == "") company = null

            return Contact4(name, number, company)
            println()
        }
    }
}


fun main() {

    val listOfContact = mutableListOf(Contact4("Lena", 12, "ooo"))

    val contact = Contact4("Fedor", 888)
    val contact1 = contact.createContact()
    if (contact1 != null) listOfContact.add(contact1)

    contact.printContact(listOfContact)
}