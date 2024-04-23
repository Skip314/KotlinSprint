package org.example.lesson_18

class Order(
    val orderNum: Int
) {

    fun printInfo(item: String){
        println(item)
    }

    fun printInfo(item: List<String>){
        println(item)
    }
}

fun main() {

    val order1 = Order(1)
    order1.printInfo("hummer")
    order1.printInfo(listOf("hummer", "car", "lemon"))
}