package org.example.lesson_15

abstract class WeatherStationStats {
    abstract fun getData()
}

class Temperature(
    private val temperature: Int
) : WeatherStationStats() {

    override fun getData() {
        println("Текущая температура: $temperature")
    }
}

class PrecipitationAmount(
    private val amount: Int
) : WeatherStationStats() {

    override fun getData() {
        println("Количество осадков: $amount")
    }
}

class WeatherServer {
    fun sendMessage(weatherData: WeatherStationStats) {
        print("Отправка данных на сервер: ")
        weatherData.getData()
    }
}

fun main() {

    val temperature = Temperature(20)
    val amount = PrecipitationAmount(10)

    val weatherServer = WeatherServer()
    weatherServer.sendMessage(temperature)
    weatherServer.sendMessage(amount)
}