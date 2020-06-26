import java.util.*

fun main(args: Array<String>) {
/*    val rollDice: (Int) -> Int = { numberOfDice: Int ->
*//*        val sumOfDice = Random().nextInt(numberOfDice * 6) + 1
        getMinSumOfDice(numberOfDice, sumOfDice)*//*

        var sumOfDice = 0;
        for (i in 1..numberOfDice) sumOfDice += Random().nextInt(6) + 1
        sumOfDice
    }*/

    print("Enter the number of Dice : ")
    println("Roll dice ! result : " + rollDice(readLine()?.toIntOrNull() ?: 1) {
        Random().nextInt(it * 6) + 1
    })
}

fun rollDice(numberOfDice: Int, rolling: (Int) -> Int) : Int {
    val sumOfDice = rolling(numberOfDice)
    return getMinSumOfDice(numberOfDice, sumOfDice)
}

fun getMinSumOfDice(numberOfDice: Int, sumOfDice: Int) =
    if (sumOfDice < numberOfDice) numberOfDice else sumOfDice
