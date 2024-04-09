package org.example.lesson_22

data class DataBook(
    val name: String,
    val author: String,
    val quantity: Int,
)

fun main() {

    val rBook = DataBook("Regular", "Los'", 10)

    val name = rBook.name
    println(name)

    val author = rBook.author
    println(author)

    val quantity = rBook.quantity
    println(quantity)
}
