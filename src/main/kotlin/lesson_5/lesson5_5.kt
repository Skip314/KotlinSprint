package org.example.lesson_5

import kotlin.random.Random

fun main() {

    val minNum = 0
    val maxNum = 21

    val vinNumList = mutableListOf<Int>(getVinNum(minNum, maxNum),
        getVinNum(minNum, maxNum), getVinNum(minNum, maxNum))

    println("Испытай свою удачу!")
    println("Введите первую цифру от $minNum до $maxNum")
    var inputNum1 = readln()!!.toInt()
    println("Введите вторую цифру от $minNum до $maxNum")
    var inputNum2 = readln()!!.toInt()
    println("Введите третью цифру от $minNum до $maxNum")
    var inputNum3 = readln()!!.toInt()

    val quantityPoint = countNum(inputNum1, vinNumList) + countNum(inputNum2, vinNumList,) +
            countNum(inputNum3, vinNumList)

    val result = when (quantityPoint) {
        3 -> "Вы выйграли джекпот"
        2 -> "Вы получаете крупный приз"
        1 -> "Вы получаете утешительный приз"
        else -> "Вы проиграли"
    }
    println("Вы угадали $quantityPoint чисел из 3, $result")

}
fun getVinNum(minNum: Int, maxNum: Int): Int {

    return Random.nextInt(minNum, maxNum +1)

}
fun countNum(num: Int, list: MutableList<Int>): Int {
    //Функция присваивает 1 если такое число есть в списке, и 0 если нет
    val result: Int
    if(list.contains(num) == true) {
        result = 1
        println("Вы угадали $num")
    }
    else result = 0

    return result
}