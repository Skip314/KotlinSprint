package org.example.lesson_13

class Contact4(

    val name: String,
    val number: Long,
    var company: String? = null
) {

    val listOfContact = mutableListOf<Contact4>()

    fun printContact() {

        if (company == null) company = "<не указано>"
        println("Имя: $name, Номер: $number, Компания: $company")
    }

    fun createContact(){

        val name = "Fedor"
        val number: Long = 8777345
        val company = null

        val contact = Contact4(name, number, company)
        listOfContact.add(contact)
    }
}

fun main() {


}