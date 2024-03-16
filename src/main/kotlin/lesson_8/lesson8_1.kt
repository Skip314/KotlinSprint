package org.example.lesson_8

fun main() {

    val arrayOfQuantityAdvertising: Array<Int> = arrayOf(0, 0, 0, 0, 0, 0, 0)

    val advertisingDay1 = 12
    val advertisingDay2 = 34
    val advertisingDay3 = 17
    val advertisingDay4 = 8
    val advertisingDay5 = 42
    val advertisingDay6 = 46
    val advertisingDay7 = 24

    arrayOfQuantityAdvertising.set(0, advertisingDay1)
    arrayOfQuantityAdvertising.set(1, advertisingDay2)
    arrayOfQuantityAdvertising.set(2, advertisingDay3)
    arrayOfQuantityAdvertising.set(3, advertisingDay4)
    arrayOfQuantityAdvertising.set(4, advertisingDay5)
    arrayOfQuantityAdvertising.set(5, advertisingDay6)
    arrayOfQuantityAdvertising.set(6, advertisingDay7)

    var sumAdvertising = 0

    for (i in arrayOfQuantityAdvertising) {

        sumAdvertising += i

    }

    println(sumAdvertising)

}