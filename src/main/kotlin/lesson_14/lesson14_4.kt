package org.example.lesson_14

abstract class Bodies(
    val name: String,
    val isAtmosphere: Boolean,
    val isLanding: Boolean,
)

class Planet(
    name: String,
    isAtmosphere: Boolean,
    isLanding: Boolean,
) : Bodies(name, isAtmosphere, isLanding) {

    val listOfSputnik = mutableListOf<Sputnik>()

    fun addSputnik(sputnik: Sputnik) = listOfSputnik.add(sputnik)


    fun printPlanet() {
        print("Планета: $name, спутники: ")
        for (i in listOfSputnik)
            print(" ${i.name},")
    }
}

class Sputnik(
    name: String,
    isAtmosphere: Boolean,
    isLanding: Boolean
) : Bodies(name, isAtmosphere, isLanding)

fun main() {

    val mars = Planet("Mars", false, true)

    val sputnik1 = Sputnik("Fobos", false, true)
    mars.addSputnik(sputnik1)

    val sputnik2 = Sputnik("Deimos", false, true)
    mars.addSputnik(sputnik2)

    mars.printPlanet()
}