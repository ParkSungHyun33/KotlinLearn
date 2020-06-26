package Aquarium

fun main(args: Array<String>) {
/*    val fish = Fish()

    println("Name : ${fish.name}, " +
            "Friendly : ${fish.friendly} " +
            "VolumeNeeded : ${fish.volumeNeeded}, " +
            "Size : ${fish.size}")

    fish.size = 100
    println("Name : ${fish.name}, " +
            "Friendly : ${fish.friendly} " +
            "VolumeNeeded : ${fish.volumeNeeded}, " +
            "Size : ${fish.size}")*/

    var fish2 = Fish() // Use default values
    fish2 = Fish("Tuna", false, 15) // simply passing arguments
    fish2 = Fish(name = "Tuna", friendly = false, volumeNeeded = 15) // more readable way

    fish2 = Fish("shark")
    println("fish2, Friendly: ${fish2.friendly}," +
            " VolumeNeeded : ${fish2.volumeNeeded} L, " +
            "TankSize : ${fish2.size} L")
}
