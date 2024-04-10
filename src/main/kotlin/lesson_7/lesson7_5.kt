package org.example.lesson_7

fun main() {

    val rangeChar = 'a'..'z'
    val rangeCaps = 'A'..'Z'
    val rangeNum = '0'..'9'

    val password = mutableListOf<String>()

    println("Введите желаемое колличество символов в пароле ")
    print("минимум $MIN_LENGTH_PASS: ")
    val inputLengthPass = readln().toInt()

    if (inputLengthPass < MIN_LENGTH_PASS) return

    print("Ваш сгенерированный пароль: ")

    password.add(rangeChar.random().toString())
    password.add(rangeCaps.random().toString())
    password.add(rangeNum.random().toString())

    for (i in 4..inputLengthPass) {

        val numRange = 1..3
        val getRandomRange = numRange.random()
        when (getRandomRange) {
            1 -> password.add(rangeChar.random().toString())
            2 -> password.add(rangeCaps.random().toString())
            3 -> password.add(rangeNum.random().toString())
        }
    }
    password.shuffle()
    println(password.joinToString(""))
}

const val MIN_LENGTH_PASS = 6