package Aquarium

abstract class AquariumFish : FishAction {
    abstract val color: String
    override fun eat() = println("yum")
}

interface FishColor {
    val color: String
}

interface FishAction {
    fun eat() // abstract fun eat()
}

class Shark(fishColor: FishColor) :
    FishColor by fishColor,
    FishAction by PrintingFishAction("hunt and eat fish") {
}

class Tuna :
    FishColor by SilverFishColor,
    FishAction by PrintingFishAction("anchovy or small fish") {
}

object GrayFishColor : FishColor {
    override val color = "gray"
}

object SilverFishColor : FishColor {
    override val color = "silver"
}

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println("$food")
    }
}

fun main(args: Array<String>) {
    val shark = Shark(GrayFishColor)
    val tuna = Tuna()

    println(
        "Shark : ${shark.color}," +
                " Tuna : ${tuna.color}"
    )

    feedFish(shark)
    feedFish(tuna)
}

fun getFishColor(fish: AquariumFish): String {
    return fish.color
}

fun feedFish(fish: FishAction) {
    fish.eat()
}