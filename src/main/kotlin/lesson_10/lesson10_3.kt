package org.example.lesson_10

fun main() {

    print("Введите желаемое количество символов в пароле: ")
    val inputQuantitySimvol = readln().toInt()

    createPass(inputQuantitySimvol)

}

fun createPass(quantity: Int) {

    val quantityRange = 1..quantity
    val spec = '\u0020'..'\u002f'
    val range = 0..9

    for (i in quantityRange) {

        if (i % 2 != 0) print(range.random())
        else print(spec.random())
    }
}