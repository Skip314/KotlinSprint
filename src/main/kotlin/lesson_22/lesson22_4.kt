package org.example.lesson_22

class ViewModel(
    var stat: MainScreenStat,
) {
    fun loadData(stat: Int): String {
        return when (stat) {
            1 -> "загрузка данных"
            2 -> "наличие загруженных данных"
            else -> "отсутствие данных"
        }
    }
}

data class MainScreenStat(
    var data: String,
    private var isLoading: Boolean = false,
) {

    fun changeIsLoad() {

        this.copy()
        isLoading = true
    }
}

fun main() {

    val stat = MainScreenStat("data")
    val screen = ViewModel(stat)

    println(screen.loadData(0))

    stat.changeIsLoad()
    println(screen.loadData(1))
}