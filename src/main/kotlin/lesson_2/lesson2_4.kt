package org.example.lesson_2

fun main() {

    val cristalOre: Int = 7
    val ironOre: Int = 11
    val chance = 20

    val bafCristalOre = cristalOre * chance / 100
    println("Добыто ${bafCristalOre.toInt()} бонусной кристалической руды")
    val bafIronOre = ironOre * chance / 100
    println("Добыто ${bafIronOre.toInt()} бонусной железной руды")

}