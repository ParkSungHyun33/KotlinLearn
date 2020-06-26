package ClassTest

fun main(args: Array<String>) {

    val aquarium = Aquarium()

    println("Width : ${aquarium.width}, " +
            "Height : ${aquarium.height}, " +
            "Length : ${aquarium.length}, " +
            "Volume : ${aquarium.volume} L")

    aquarium.volume = 160
    println("Width : ${aquarium.width}, " +
            "Height : ${aquarium.height}, " +
            "Length : ${aquarium.length}, " +
            "Volume : ${aquarium.volume} L")

    val aquarium2 = Aquarium(numberOfFish = 9)

    val towerTank = TowerTank()
    println("Width : ${towerTank.width}, " +
            "Height : ${towerTank.height}, " +
            "Length : ${towerTank.length}, " +
            "Water : ${towerTank.water} L, " +
            "Volume : ${towerTank.volume} L")
}