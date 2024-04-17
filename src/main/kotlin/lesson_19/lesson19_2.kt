package org.example.lesson_19

enum class Category(categoryName: String) {
    CLOTHING("Вещи"),
    STATIONERY("Канцелярские товары"),
    OTHERS("Другое");

    fun getCategoryName() = when (this) {
        CLOTHING -> "Вещи"
        STATIONERY -> "Канцелярские товары"
        else -> "Другое"
    }
}

class Item(
    val id: Int,
    val name: String,
    val category: Category
) {
    fun printInfo() {

        println("ID: $id, $name, ${category.getCategoryName()}")
    }
}

fun main() {

    val clothing = Item(0, "Майка А", Category.CLOTHING)
    val other = Item(1, "Штора", Category.OTHERS)

    clothing.printInfo()
    other.printInfo()
}

