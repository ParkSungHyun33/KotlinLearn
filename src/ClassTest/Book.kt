package ClassTest

class Book(
    val title: String,
    val author: String,
    val year: Int
) {
    fun getTitleAuthor() : Pair<String, String> {
        return title to author
    }

    fun getTitleAuthorYear() : Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}

fun main(args: Array<String>) {
    val book = Book("Romeo and Juliet",
        "William Shakespeare",
        1597)

    val (title, author) = book.getTitleAuthor()
    val year = book.getTitleAuthorYear().third

    println("Here is your book $title written by $author in $year.")
}