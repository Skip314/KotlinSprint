package org.example.lesson_5

fun main() {

    val vinNum1 = "31"
    val vinNum2 = "42"

    println("""
        Добро пожаловать в лоторею!
        Угадайте два числа от 0 до 42 и выйграйте приз!
        Введите ваши числа
    """.trimIndent())

    val inputNum1 = readLine().toString()
    val inputNum2 = readLine().toString()

    println(compareNum(vinNum1, vinNum2, inputNum1, inputNum2))

}
fun compareNum(vinNum1: String, vinNum2: String, num1: String, num2: String): String {

    return when {
        (num1 == vinNum1 || num2 == vinNum1) && (num1 == vinNum2 || num2 == vinNum2) -> "Поздравляем! Вы выиграли главный приз!"
        (num1 == vinNum1 || num2 == vinNum1) || (num1 == vinNum2 || num2 == vinNum2) -> "Вы выиграли утешительный приз!"
        else -> "Неудача"
    }
}