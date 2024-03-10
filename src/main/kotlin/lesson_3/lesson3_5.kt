package org.example.lesson_3

fun main() {

    val moveInfo = "D2-D4;0"

    val positionStart = moveInfo.substring(0,2)
    println(positionStart)

    val positionFinish = moveInfo.substring(3,5)
    println(positionFinish)

    val moveNum = moveInfo.substring(6, moveInfo.lastIndex+1)
    println(moveNum)

}