package org.example.lesson_6

fun main() {

    val rateNum = 1..9
    var attempts = 5
    val vinNum = 3
    var indikator: Boolean = false
    var inputNum: Int

    while (attempts > 0 && indikator == true) {
        attempts--
        println("Угадайте число $rateNum")
        inputNum = readln().toInt()
        if (inputNum == vinNum) {
            indikator = true
            println("You vin")
        }
    }

}
