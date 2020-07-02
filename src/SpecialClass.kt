
object Hamlet {
    val author: String = "Shakespeare"

    fun readStroy() {

    }
}

fun main(args: Array<String>) {
    EventManager.setListener(object : OnClickListener {
        override fun onClick() {
            println("onClick")
        }
    })

    colorTest()
}

interface OnClickListener {
    fun onClick()
}

object EventManager {
    var clickListener: OnClickListener? = null

    fun setListener(listener: OnClickListener) {
        clickListener = listener
    }
}

enum class Color(var rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

fun colorTest() {
    println(Color.RED)
    println(Color.GREEN)
    println(Color.BLUE)

    println(Color.RED.ordinal)
    println(Color.GREEN.ordinal)
    println(Color.BLUE.ordinal)
}

sealed class NetworkResult

class Success: NetworkResult()
class Timeout: NetworkResult()
class Rejected: NetworkResult()

fun matchNetworkResult(result: NetworkResult) : String {
    return when(result) {
        is Success -> "Success"
        is Timeout -> "Timeout"
        is Rejected -> "Rejected"
    }
}