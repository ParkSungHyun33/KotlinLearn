package Aquarium

class Fish(var name: String,
           var friendly: Boolean,
           var volumeNeeded: Int) {
    val size: Int

    init {
        println("First init block")
        when (name) {
            "shark" -> friendly = false
        }
        size = if (friendly) volumeNeeded else volumeNeeded * 2
    }

    constructor() : this("Tuna", true, 20) {
        println("Running secondary constructor 1")
    }

    constructor(name: String) : this(name, true, 20) {
        println("Running secondary constructor 2")
    }

}
