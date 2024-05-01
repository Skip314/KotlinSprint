package org.example.lesson_22

class ViewModel(
    var stat: MainScreenStat,
) {
    data class MainScreenStat(
        var data: String,
        private var isLoading: Boolean = false,
    ) {

        fun changeIsLoad() {

            this.copy()
            isLoading = true
        }
    }

    fun loadData(stat: Int): String {
        return when (stat) {
            1 -> "загрузка данных"
            2 -> "наличие загруженных данных"
            else -> "отсутствие данных"
        }
    }
}


fun main() {

    val screen = ViewModel(ViewModel.MainScreenStat("data"))
    screen.
    println(screen.loadData(0))



    println(screen.loadData(1))
}