package org.example.lesson_15

abstract class WeatherStationStatus()

class WeatherServer(){

    fun sendResult(){
        println("Сообщение отправлено")
    }
}

class Temperature(
    val temperature: Int
)

class PrecipitationAmount(
    val amount: Int
)
fun main() {

    val temperature = Temperature(30)
    val amount = PrecipitationAmount(20)
}