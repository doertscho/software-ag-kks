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

    val text = readLine() ?: ""

    val chessBoard: ChessBoard = ChessBoard(arrayOf())

    chessBoard.fields[3][5] = ChessPawn(ChessPawnType.Queen, Colour.White)
    chessBoard.fields[0][3] = ChessPawn(ChessPawnType.Bishop, Colour.Black)
    chessBoard.fields[2][7] = null

    val pawn: ChessPawn? = chessBoard.fields[6][1]
    val currentColour: Colour? = pawn ?. colour
    val currentType: ChessPawnType = pawn?.type ?: ChessPawnType.Bishop
}
