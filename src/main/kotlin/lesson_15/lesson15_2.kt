package org.example.lesson_15

abstract class WeatherStationStatus(
    val temperature: Int,
    val amount: Int,
)

class WeatherServer(){

    fun sendResult(){
        println("Сообщение отправлено")
    }
}

class Temperature(
    temperature: Int,
    amount: Int
): WeatherStationStatus(temperature, amount)

class PrecipitationAmount(
    temperature: Int,
    amount: Int
): WeatherStationStatus(temperature, amount)
fun main() {

    val temperature = Temperature(30, 30)
    val amount = PrecipitationAmount(20, 25)
}