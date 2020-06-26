package ClassTest

import kotlin.math.PI

open class Aquarium(var width: Int = 20,
                   var height: Int = 40,
                   var length: Int = 100) {
    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    open var water: Double = 0.0

    init {
        water = volume * 0.9
        println("Initial Height is $height," +
                " water amount is $water L, volume is $volume L")
    }

    constructor(numberOfFish: Int) : this() {
        water = numberOfFish * 2.0
        volume = (water / 0.9).toInt()
        println("New Fish!! Height is $height, " +
                "water amount is $water L, volume is $volume L")
    }
}

class TowerTank() : Aquarium() {
    override var water = volume * 0.8

    override var volume: Int
        get() = (width * length * PI * height / 1000).toInt()
        set(value) {
            height = (value * 1000) / (width * length)
        }
}