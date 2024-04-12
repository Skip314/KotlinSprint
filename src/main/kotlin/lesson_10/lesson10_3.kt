package org.example.lesson_10

fun main() {

    print("Введите желаемое количество символов в пароле: ")
    val inputQuantitySimvol = readln().toInt()

    getRandomSimvol(inputQuantitySimvol)

}

fun getRandomSimvol(quantity: Int) {

    var quantityRange = 1..quantity
    val spec = '\u0020'..'\u002f'
    val range = 0..9

    for (i in quantityRange) {

        if (i % 2 != 0) print(range.random())
        else print(spec.random())
    }
}