package org.example.lesson_1

fun main() {

    val secondInSpase: Short = 1

    println(transSecond(secondInSpase))

}
fun transSecond(second: Short): String {

    // С циклом for пока не дружу

    val timeSecond = second % 60
    val minute: Int = second / 60
    val resSecond: String
    val resMinute: String

    if (timeSecond < 10) resSecond = "0${timeSecond}"
        else resSecond = timeSecond.toString()

    val timeMinute: Int = minute % 60
    if (timeMinute < 10) resMinute = "0${timeMinute}"
    else resMinute = timeMinute.toString()

    val hour: Int = minute / 60

    return "${hour}:${resMinute}:${resSecond}"
}