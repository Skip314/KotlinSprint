package org.example.lesson_3

fun main() {

    val moveInfo = "D2-D4;0"

    val delim1 = "-"
    val delim2 = ";"

    val splitInfo = moveInfo.split(delim1, delim2)

    val posStart = splitInfo[0]
    val posFinish = splitInfo[1]
    val moveNum = splitInfo[2]

    println(posStart)
    println(posFinish)
    println(moveNum)

}