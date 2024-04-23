package org.example.lesson_22

class RegularBook2(
    val name: String,
    val author: String,
)

data class DataBook2(
    val name: String,
    val author: String,
)

fun main() {

    val rBook1 = RegularBook("Лестница", "Ленин")
    println(rBook1)     //показан строковое представление объекта по умолчанию

    val dBook1 = DataBook1("Лестница", "Ленин")
    println(dBook1)     //метод toString для data class переопределен под капотом
}
