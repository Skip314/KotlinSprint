package org.example.lesson_6

fun main() {

    val rateNum = 1..9
    var attempts = 5
    val vinNum = rateNum.random()
    var inputNum: Int

    while (attempts > 0) {
        attempts--
        println("Угадайте число $rateNum")
        inputNum = readln().toInt()
        if (inputNum == vinNum) {
            println("Это была великолепная игра!")
            return
        }else println("Неверно")
    }
    println("Было загадано число $vinNum")

}
