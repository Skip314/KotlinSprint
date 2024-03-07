package org.example.lesson_2

fun main() {

    val ballStudent1: Byte = 3
    val ballStudent2: Byte = 4
    val ballStudent3: Byte = 3
    val ballStudent4: Byte = 5

    println(averageBall(ballStudent1, ballStudent2, ballStudent3, ballStudent4))

}
fun averageBall(ball1: Byte, ball2: Byte, ball3: Byte, ball4: Byte): Float {

    val result = (ball1 + ball2 + ball3 + ball4) / 4f

    return result
}