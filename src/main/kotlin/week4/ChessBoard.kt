package week4

enum class ChessPawnType {
    King,
    Queen,
    Tower,
    Knight,
    Bishop,
    Peasant,
}

enum class Colour {
    White,
    Black,
}

data class ChessPawn(
        val type: ChessPawnType,
        val colour: Colour
)

data class ChessBoard(
        val fields: Array<Array<ChessPawn?>>
)

fun main() {

    // Arrays können auf verschiedene Weisen initialisiert werden.
    // Hier ein Beispiel für die Erstellung eines zweidimensionalen Arrays
    // mit 8x8 Feldern, die jeweils anfangs den null-Wert enthalten
    // (also quasi "leer" sind):
    val emptyEightByEightArray: Array<Array<ChessPawn?>> =
        Array(8) {      // acht Zeilen ...
            Array(8) {  // ... mit je acht Feldern ...
                null        // ... die jeweils anfangs den null-Wert enthalten.
            }
        }

    val chessBoard: ChessBoard = ChessBoard(emptyEightByEightArray)

    // Den einzelnen Feldern können Werte zugewiesen werden
    // (auch der null-Wert, der signalisiert, dass das Feld leer ist):
    chessBoard.fields[3][5] = ChessPawn(ChessPawnType.Queen, Colour.White)
    chessBoard.fields[0][3] = ChessPawn(ChessPawnType.Bishop, Colour.Black)
    chessBoard.fields[2][7] = null

    // Da wir nicht wissen können, ob ein Feld eine Figur enthält oder leer ist,
    // zwingt Kotlin uns, den Fall des fehlenden Wertes explizit zu berücksichtigen.
    val pawn: ChessPawn? = chessBoard.fields[6][1]

    // Entweder müssen wir auf die Bestandteile so zugreifen, dass wir wiederum
    // die Möglichkeit eines null-Werts zulassen (darum das ? hinter "Colour"):
    val currentColour: Colour? = pawn?.colour

    // ... oder wir müssen angeben, was wir im Falle des leeren Werts als
    // "Standard" verwenden wollen (hier ChessPawnType.Bishop):
    val currentType: ChessPawnType = pawn?.type ?: ChessPawnType.Bishop
}
