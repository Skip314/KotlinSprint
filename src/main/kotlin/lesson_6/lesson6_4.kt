package org.example.lesson_6

fun main() {

    val rateNum = 1..9
    var attempts = 5
    val vinNum = rateNum.random()
    var indikator: Boolean = false
    var inputNum: Int

    while (attempts > 0 && indikator != true) {
        attempts--
        println("Угадайте число $rateNum")
        inputNum = readln().toInt()
        if (inputNum == vinNum) {
            indikator = true
            println("Это была великолепная игра!")
        }else println("Неверно")
    }
    println("Было загадано число $vinNum")

}
