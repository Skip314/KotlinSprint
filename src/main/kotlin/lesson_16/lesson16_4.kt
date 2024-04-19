package org.example.lesson_16

class Order(
    private var status: String,
    private val orderNum: Int,
) {
    fun newStatus(newStatus: String) {
        status = newStatus
    }
}

fun main() {

    val order = Order(ASSEMBLY, 1)
    changeStatus(order, READY)
}

fun changeStatus(order: Order, newStatus: String) {
    order.newStatus(newStatus)
}

const val READY = "Готов к получению"
const val ASSEMBLY = "Сборка заказа"