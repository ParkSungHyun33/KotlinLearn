package ClassTest

fun main(args: Array<String>) {
    val curry = Curry("Curry", "mild")
    curry.prepareSpice()

    val curry2 = Curry("Red Curry", "spicy", RedSpiceColor)
    curry2.prepareSpice()

    val curryA = SpiceContainer(Curry("A Curry", "mild"))
    val curryA2 = curryA.copy()
    val curryA3 = SpiceContainer(Curry("A Curry", "mild"))

    println("curry A == curry A2 ? ${curryA.equals(curryA2)}")
    println("curry A == curry A3 ? ${curryA.equals(curryA3)}")
}