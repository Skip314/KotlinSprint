package org.example.lesson_7

fun main() {

    val rangeNum = 0..9
    val rangeString: CharRange = 'a'..'z'

    val pas = listOf(
        getStringRandom(rangeString), getIntRandom(rangeNum),
        getStringRandom(rangeString), getIntRandom(rangeNum),
        getStringRandom(rangeString), getIntRandom(rangeNum),
        )

    for (item in pas) print(item)

}
fun getIntRandom(range: IntRange): String {
    return range.random().toString()
}
fun getStringRandom(range: CharRange): String {
    return range.random().toString()
}