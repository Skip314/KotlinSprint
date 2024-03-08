package org.example.lesson_1

fun main() {

    val secondInSpase: Short = 6480

    val hour: Int = secondInSpase / 3600
    val minute: Int = secondInSpase / 60 - hour * 60
    val second: Int = 6480 % 60

    println(String.format("%02d:%02d:%02d", hour, minute, second))

    //println(transSecond(secondInSpase))

}
/*fun transSecond(second: Short): String {

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
}*/