package org.example.lesson_17

class Order4(
    val orderNum: Int,
    place: String = STORE,
) {
    var traveling = 0

    var place = STORE
        set(value) {
            field = value
            if (field == SORTING) {
                println("Заказ: $orderNum прибыл в $SORTING")
                traveling++
            }
            if (field == POINT) {
                println("Заказ: $orderNum прибыл в $POINT")
                traveling++
            }
        }
}
fun main() {

    val order = Order4(1)
    order.place = SORTING
    order.place = POINT
}


const val STORE = "store"
const val SORTING = "sorting"
const val POINT = "point"