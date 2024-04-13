package org.example.lesson_22

class RegularBook(
    val name: String,
    val author: String,
)

data class DataBook1(
    val name: String,
    val author: String,
)

fun main() {

    val rBook1 = RegularBook("Лестница", "Ленин")
    val rBook2 = RegularBook("Лестница", "Ленин")
    val dBook1 = DataBook1("Лестница", "Ленин")
    val dBook2 = DataBook1("Лестница", "Ленин")

    println(rBook1 == rBook2) // сравнивает ссылки
    println(dBook1 == dBook2) // сравнивает значения
}