package week5.players

import week5.*

class WinningMovePlayer : Player {

    override fun nextMove(state: State): Move {

        val winningMove = winningMove(state)
        if (winningMove != null) {
            return winningMove
        }

        val fallback = ValidMovePlayer()
        return fallback.nextMove(state)
    }

    fun winningMove(state: State): Move? {
        for (row in 0 .. 2) {
            for (column in 0 .. 2) {
                if (isValidMove(state, Move(row, column))) {
                    state.field[row][column] = state.nextPlayerSymbol
                    val winner = winner(state)
                    state.field[row][column] = null
                    if (winner == state.nextPlayerSymbol) {
                        return Move(row, column)
                    }
                }
            }
        }
        return null
    }
}