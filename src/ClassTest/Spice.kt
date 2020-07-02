package ClassTest

interface SpiceColor {
    val color: Color
}

interface Grinder {
    fun grind()
}

sealed class Spice(
    val name: String,
    val spiceness: String = "mild",
    color: SpiceColor
) : SpiceColor by color {
    abstract fun prepareSpice()
}

class Curry(
    name: String,
    spiceness: String,
    color: SpiceColor = YellowSpiceColor
) : Spice(name, spiceness, color), Grinder {
    override fun grind() {
        println("Grind $color curry to powder")
    }

    override fun prepareSpice() {
        grind()
    }
}

object YellowSpiceColor : SpiceColor {
    override val color: Color
        get() = Color.YELLOW
}

object RedSpiceColor : SpiceColor {
    override val color: Color
        get() = Color.RED
}

data class SpiceContainer(val spice: Spice)

enum class Color(var rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00)
}
