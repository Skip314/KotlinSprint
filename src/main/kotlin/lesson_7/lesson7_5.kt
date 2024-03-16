package org.example.lesson_7

fun main() {

    val rangeStrok = 'a'..'z'
    val randeZaglav = 'A'..'Z'
    val rangeNumer = '0'..'9'

    var password: String

    println("Введите желаемое колличество символов в пароле ")
    print("минимум $MIN_LENGTH_PASS: ")
    var inputLengthPass = readln().toInt()

    if (inputLengthPass < MIN_LENGTH_PASS) return

    print("Ваш сгенерированный пароль: ")

    for (i in 1..inputLengthPass) {

        val numRange = 1..3
        val getRandomRange = numRange.random()
        when (getRandomRange) {
            1 -> print(rangeStrok.random())
            2 -> print(randeZaglav.random())
            3 -> print(rangeNumer.random())
        }

        Thread.sleep(1000)

    }
}

const val MIN_LENGTH_PASS = 6