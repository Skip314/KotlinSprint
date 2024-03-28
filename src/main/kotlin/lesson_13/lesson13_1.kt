package org.example.lesson_13

class Contact(

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
}
fun main() {

    val contact1 = Contact("Fedor", 8800333, "ooo fabric")
    val contact2 = Contact("Lena", 8891000)
}