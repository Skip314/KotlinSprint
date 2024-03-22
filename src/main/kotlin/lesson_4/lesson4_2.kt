package org.example.lesson_4

fun main() {

    // Average от 35 кг до 100 кг до 100 л

    val weightCargo1 = 20
    val volumeCargo1 = 80

    val weightCargo2 = 50
    val volumeCargo2 = 100

    println(
        "Груз с весом $weightCargo1 кг и объемом $volumeCargo1 л соответствует категории 'Average': ${
            weightCargo1 in AVERAGE_MIN_WEIGHT..AVERAGE_MAX_WEIGHT && volumeCargo1 < AVERAGE_MAX_VOLUME
        }"
    )

    println(
        "Груз с весом $weightCargo2 кг и объемом $volumeCargo2 л соответствует категории 'Average': ${
            weightCargo2 in AVERAGE_MIN_WEIGHT..AVERAGE_MAX_WEIGHT && volumeCargo2 < AVERAGE_MAX_VOLUME
        }"
    )

}

const val AVERAGE_MIN_WEIGHT = 35
const val AVERAGE_MAX_WEIGHT = 100
const val AVERAGE_MAX_VOLUME = 100