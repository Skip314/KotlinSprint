package org.example.lesson_22

class ViewModel(
    var state: MainScreenStat = MainScreenStat(""),
) {
    data class MainScreenStat(
        var data: String,
        var isLoading: Boolean = false,
    )

    fun loadData() {
        val newState = state.copy(isLoading = true)
        newState.isLoading = false
        newState.data = "отсутствие данных"
        state = newState
    }
}


fun main() {

    val screen = ViewModel(ViewModel.MainScreenStat("Data"))
    screen.loadData()
    println(screen.state)
}