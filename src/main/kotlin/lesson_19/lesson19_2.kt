package org.example.lesson_19

enum class Category(categoryName: String) {
    CLOTHING("Вещи"),
    STATIONERY("Канцелярские товары"),
    OTHERS("Другое");

}

class Item(
    val id: Int,
    val name: String,
    val category: Category
) {
    fun printInfo() {

        println("$name, ${category.categoryName}")
    }

}

fun main() {

    val clothing = Item(0, "Short", Category.CLOTHING)

    clothing.printInfo()
}

