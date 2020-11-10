package week4

data class Book(
        val title: String,
        val author: String,
        val publication: Int
)

fun bookInfo(book: Book) {
    val title: String = book.title
    println("Das Buch '${book.title}' wurde geschrieben von ${book.author}")
}

fun main() {

    val bible: Book = Book("Bibel", "Gott", 800)
    val theWall: Book = Book("The Wall", "Richard Bookwriter", 2019)

    val newBook = Book(author = "Random Person", title = "Random Book", publication = 2015)

    val library: Map<Int, Book> = mapOf(
            1 to bible,
            2 to theWall,
            3 to Book("Tausend tolle Rezepte", "Manfred Meisterkoch", 2014)
    )

    bookInfo(theWall)
}
