
fun main(args: Array<String>) {
    val equipment = "fishnet" to "catching fish"
    println("equipment = $equipment")

    println(equipment.first)
    println(equipment.second)

    val equipment2 = ("fishnet" to "catching fish") to ("of big size" to "and strong")
    println("equipment2 = ${equipment2}")

    println(equipment2.first)
    // ((fishnet, catching fish), "of big size")
    println(equipment2.second)
    println(equipment2.first.first)

    val (tool, use) = giveMeAEquipment()
    println(tool)
    println(use)

    val triples = Triple("A", 1, 300.0)
    println(triples)

    val (first, second, third) = triples
    println("First : $first, Second : $second, Third : $third")


    val testList = listOf(11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
    println(reverseList(testList))
    println(testList.reversed())

    val fishList = mutableListOf("shark", "tuna", "salmon", "goldfish")
    fishList.add("bass")

    fishList.contains("tuna") // true
    fishList.contains("dolphin") // false

    println(fishList.subList(4, fishList.size))
    println(listOf(1, 5, 7).sum()) // 13

    println(listOf("a", "b", "cc").sumBy { item ->
        item.length
    })

    val nameMap = mapOf(1 to "Park", 2 to "Choi")
    println("first element : ${nameMap.get(1)}")
    println("first element : ${nameMap[1]}")

    val fishColorMap = mutableMapOf("shark" to "gray", "tuna" to "silver")
    fishColorMap.put("goldfish", "red")
    // fishColorMap["goldFish"] = "red"
    fishColorMap.remove("goldfish")

    println(fishColorMap.getOrDefault("salmon",
        "Sorry I don't know"))
    println(fishColorMap.getOrElse("salmon") {
        // Web search
        "No results"
    })

    val numbers = mutableSetOf(1, 2, 3, 4) // LinkedHashSet
    val numbersBackwards = setOf(4, 3, 2, 1) // LinkedHashSet
    println("The sets are equal: ${numbers == numbersBackwards}") // The sets are equal: true

    println(numbers.first() == numbersBackwards.first()) // false
    println(numbers.first() == numbersBackwards.last()) // true
}

fun reverseList(list: List<Int>) : List<Int> {
    val result = mutableListOf<Int>()
    for (i in 0..list.size-1) {
        result.add(list[list.size-i-1])
    }
    return result
}

fun reverseListAgain(list: List<Int>) : List<Int> {
    val result = mutableListOf<Int>()
    for (i in list.size-1 downTo 0) {
        result.add(list[i])
    }
    return result
}

fun giveMeAEquipment() : Pair<String, String> {
    return "fishnet" to "catching fish"
}
