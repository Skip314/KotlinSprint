package org.example.lesson_22

data class DataBook(
    val name: String,
    val author: String,
    val quantity: Int,
)

fun main() {

    val rBook = DataBook("Regular", "Los'", 10)

    val (bookName, bookAuthor, booksQuantity) = rBook
    println("$bookName, $bookAuthor, $booksQuantity")
}
