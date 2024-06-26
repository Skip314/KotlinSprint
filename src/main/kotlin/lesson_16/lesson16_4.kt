package org.example.lesson_16

class Order(
    private var status: String,
    private val orderNum: Int,
) {

    private fun assignNewOrderStatus(newStatus: String) {
        status = newStatus
    }

    fun sendRequest(newStatus: String) = assignNewOrderStatus(newStatus)
}

fun main() {

    val order = Order(ASSEMBLY, 1)
    changeStatus(order, READY)
}

fun changeStatus(order: Order, newStatus: String) {
    order.sendRequest(newStatus)
}

const val READY = "Готов к получению"
const val ASSEMBLY = "Сборка заказа"