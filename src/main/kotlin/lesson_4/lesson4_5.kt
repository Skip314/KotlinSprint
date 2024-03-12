package org.example.lesson_4

fun main() {

    println("Укажите поврежден ли корабль")
    val bortCrash = readln()

    println("Введите колличество экипажа")
    val worker = readln()

    println("Укажите количество ящиков провизии")
    val cargo = readln()

    println("Укажите погоду")
    val weather = readln()


    val permission = (bortCrash.toBoolean() == false && worker.toInt() in 55 .. 70 && cargo.toInt() >= 50) ||
            (bortCrash.toBoolean() == true && worker.toInt() == 70 && weather.toBoolean() == true && cargo.toInt() >= 50)

    println("Корабль может отправляться в плавание :$permission")
}