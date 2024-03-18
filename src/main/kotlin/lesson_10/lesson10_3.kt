package org.example.lesson_10

fun main() {

    println("Введите желаемое количество символов в пароле: ")
    val inputQuantitySimvol = readln().toInt()

    getRandomSimvol(inputQuantitySimvol)
}
fun getRandomSimvol(quantity: Int) {

    var quantityRange = 1..quantity
    val specSimvolList = listOf('!','"','#')
    val range = 0..9

    for(i in quantityRange) {

    }
}