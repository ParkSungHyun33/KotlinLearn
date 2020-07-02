package Decorations

data class Decorations(val rocks: String) {
    var wood: String = "wood"
}

data class Decorations2(
    val rocks: String,
    val wood: String,
    val waterPlant: String
)

fun main(args: Array<String>) {
    val d1 = Decorations("granite")
    println(d1)

    val d2 = Decorations("slate")
    println(d2)

    val d3 = Decorations("slate")
    println(d3)

    println("d1 == d2 ? ${d1.equals(d2)}" )
    println("d2 == d3 ? ${d2.equals(d3)}" )

    val d4 = d3.copy()
    println(d4)

    d3.wood = "a"
    d4.wood = "b"
    println("d3 == d4 ? ${d3.equals(d4)}")

    val d5 = Decorations2("crystal", "wood", "seaMustard")
    println(d5)

    val (rocks, wood, waterPlant) = d5
    println(rocks)
    println(wood)
    println(waterPlant)

    val d6 = d5.copy(rocks = "slate")
    print(d6)
}