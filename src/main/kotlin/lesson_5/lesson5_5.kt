package org.example.lesson_5

import kotlin.random.Random

fun main() {

    val vinNum = getVinNum()

    print("Введите поочередно три цифры: ")
    val inputNum = listOf( readln().toInt(), readln().toInt(), readln().toInt())

    println(checkNum(inputNum, vinNum))
    println("Выйгрышные числа: ${vinNum.joinToString()}")
}

fun getVinNum(): List<Int> {

    val rangeVinNum = MIN_VIN_NUM..MAX_VIN_NUM
    val listOfVinNum = mutableSetOf<Int>()

    while (listOfVinNum.size != 3){

        listOfVinNum.add(rangeVinNum.random())
    }
    return listOfVinNum.toList()
}

fun checkNum(userNum: List<Int>, vinNum: List<Int>): String {

    val check = vinNum.intersect(userNum)

    return when(check.size){
        3 -> "Вы угадали все числа и выйграли ДЖЕКПОТ!"
        2 -> "Вы угадали 2 числа и получаете крупный приз"
        1 -> "Вы угадали 1 число и получаете утешительный приз"
        else -> "Вы не угадали ни одного числа :("
    }
}

const val MIN_VIN_NUM = 0
const val MAX_VIN_NUM = 42