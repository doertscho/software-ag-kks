package week4

// Es gibt eine klar definierte Menge von Figur-Typen:
enum class ChessPieceType {
    King,
    Queen,
    Rook,
    Knight,
    Bishop,
    Pawn,
}

// Es gibt zwei Farben:
enum class Colour {
    White,
    Black,
}

// Eine konkrete Figur wird beschrieben durch ihren Typ und ihre Farbe:
data class ChessPiece(
        val type: ChessPieceType,
        val colour: Colour
)

// Ein Schachbrett ist eine zweidimensionale Anordnung von Feldern,
// auf denen jeweils eine bestimmte Figur steht – oder auch keine (darum das ?):
data class ChessBoard(
        val fields: Array<Array<ChessPiece?>>
)

fun main() {

    // Arrays können auf verschiedene Weisen initialisiert werden.
    // Hier ein Beispiel für die Erstellung eines zweidimensionalen Arrays
    // mit 8x8 Feldern, die jeweils anfangs den null-Wert enthalten
    // (also quasi "leer" sind):
    val emptyEightByEightArray: Array<Array<ChessPiece?>> =
        Array(8) {      // acht Zeilen ...
            Array(8) {  // ... mit je acht Feldern ...
                null        // ... die jeweils anfangs den null-Wert enthalten.
            }
        }

    val chessBoard: ChessBoard = ChessBoard(emptyEightByEightArray)

    // Den einzelnen Feldern können Werte zugewiesen werden
    // (auch der null-Wert, der signalisiert, dass das Feld leer ist):
    chessBoard.fields[3][5] = ChessPiece(ChessPieceType.Queen, Colour.White)
    chessBoard.fields[0][3] = ChessPiece(ChessPieceType.Bishop, Colour.Black)
    chessBoard.fields[2][7] = null

    // Da wir nicht wissen können, ob ein Feld eine Figur enthält oder leer ist,
    // zwingt Kotlin uns, den Fall des fehlenden Wertes explizit zu berücksichtigen.
    val piece: ChessPiece? = chessBoard.fields[6][1]

    // Entweder müssen wir auf die Bestandteile so zugreifen, dass wir wiederum
    // die Möglichkeit eines null-Werts zulassen (darum das ? hinter "Colour"):
    val currentColour: Colour? = piece?.colour

    // ... oder wir müssen angeben, was wir im Falle des leeren Werts als
    // "Standard" verwenden wollen (hier ChessPawnType.Bishop):
    val currentType: ChessPieceType = piece?.type ?: ChessPieceType.Bishop
}
