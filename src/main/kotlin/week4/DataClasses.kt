package week4

// In einer Datenklasse können verschiedene zusammengehörige Werte zu einem
// komplexen Wert zusammengefasst werden:
data class Book(
        val title: String,
        val author: String,
        val publication: Int
)

// Funktionen können auch komplexe Datentypen als Eingaben definieren:
fun bookInfo(book: Book) {

    // Mit dieser Schreibweise kann auf die einzelnen Elemente zugegriffen werden:
    val title: String = book.title
    println("Das Buch '${title}' wurde geschrieben von ${book.author}")
}

fun main() {

    val bible: Book = Book("Bibel", "Gott", 800)
    val theWall: Book = Book("The Wall", "John Lanchester", 2019)

    // Unter Angabe der Bezeichner kann die Reihenfolge auch verändert werden
    // (hier: Autor zuerst, dann Titel):
    val newBook = Book(author = "Random Person", title = "Random Book", publication = 2015)

    // In einer Bibliothek könnte jeweils unter einer Katalog-Nummer ein Buch hinterlegt sein,
    // dabei kann auf benannte Werte verwiesen werden ebenso wie auf direkt definierte:
    val library: Map<Int, Book> = mapOf(
            1 to bible,
            2 to theWall,
            3 to Book("Tausend tolle Rezepte", "Manfred Meisterkoch", 2014)
    )

    bookInfo(theWall)
}
