package org.example.lesson_7

fun main() {

    val rangeNum = 0..9
    val rangeString: CharRange = 'a'..'z'

    val pas = listOf(
        getStringRandom(rangeString), getIntRandom(rangeNum),
        getStringRandom(rangeString), getIntRandom(rangeNum),
        getStringRandom(rangeString), getIntRandom(rangeNum),
        )
    println("${pas[0]}${pas[1]}${pas[2]}${pas[3]}${pas[4]}${pas[5]}")

}
fun getIntRandom(range: IntRange): String {
    return range.random().toString()
}
fun getStringRandom(range: CharRange): String {
    return range.random().toString()
}