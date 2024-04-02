package org.example.lesson_15

interface Fly {

    var name: String

    fun moveFly(){
        print("${name} взлетел")
        println()
    }

    fun stopFly() {

        print("${name} приземлился")
        println()
    }
}

interface Swim {

    var name: String

    fun moveSwim() {

        print("$name поплыл")
        println()
    }

    fun stop() {

        print("${name} остановился")
        println()
    }
}

abstract class Creatures(
    val isSwim: Boolean,
    val isFly: Boolean,
)


class Carp(
    override var name: String,
    isSwim: Boolean = true,
    isFly: Boolean = false,
) : Swim, Creatures(isSwim, isFly) {

    override fun moveSwim() {

        print("Carp ")
        super.moveSwim()
    }

    override fun stop() {

        print("Carp ")
        super.stop()
    }
}

class Duck(
    override var name: String,
    isSwim: Boolean = true,
    isFly: Boolean = true,
) : Swim, Fly, Creatures(isSwim, isFly) {

    override fun moveFly() {

        print("Duck ")
        super.moveFly()
    }

    override fun moveSwim() {

        print("Duck ")
        super.moveSwim()
    }

    override fun stop() {

        print("Duck ")
        super.stop()
    }

    override fun stopFly() {

        print("Duck ")
        super.stopFly()
    }
}

class Seagull(
    override var name: String,
    isSwim: Boolean = false,
    isFly: Boolean = true,
) : Fly, Creatures(isSwim, isFly){

    override fun moveFly() {

        print("Seagull ")
        super.moveFly()
    }

    override fun stopFly() {

        print("Seagull ")
        super.stopFly()
    }
}

fun main() {

    val carp = Carp("Valera")
    carp.moveSwim()
    carp.stop()
    println()

    val duck = Duck("Trump")
    duck.moveSwim()
    duck.stop()
    duck.moveFly()
    duck.stopFly()
    println()

    val seagull = Seagull("Sasha")
    seagull.moveFly()
    seagull.stopFly()
    println()
}