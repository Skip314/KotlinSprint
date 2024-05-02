package org.example.lesson_22

class ViewModel(
    var state: MainScreenStat = MainScreenStat(""),
) {
    data class MainScreenStat(
        var data: String,
        var isLoading: Boolean = false,
    )

    fun loadData() {
        state = state.copy(isLoading = true)
    }
}


fun main() {

    val screen = ViewModel(ViewModel.MainScreenStat("Data"))
    var state = state.copy(data = loadData(), isLoading = false)
}