package org.example.lesson_22

class ViewModel() {

    var state: MainScreenStat = MainScreenStat()

    data class MainScreenStat(
        val data: String = "",
        val isLoading: Boolean = false,
    )

    fun loadData() {
        state = state.copy(isLoading = true)
        state = state.copy(data = "loaded data", isLoading = false)
    }
}

fun main() {

    val screen = ViewModel()
    screen.loadData()
    println(screen.state.data)
}