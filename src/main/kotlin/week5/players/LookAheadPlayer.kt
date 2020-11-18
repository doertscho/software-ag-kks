package week5.players

import week5.*

class LookAheadPlayer : Player {

    override fun nextMove(state: State): Move {

        val winningMove = WinningMovePlayer().winningMove(state)
        if (winningMove != null) {
            println("Found a winning move!")
            return winningMove
        }

        val safeMove = findSafeMove(state)
        if (safeMove != null) {
            println("Found a safe move!")
            return safeMove
        }

        println("Falling back to valid move")
        return ValidMovePlayer().nextMove(state)
    }

    fun findSafeMove(state: State): Move? {

        val centerMove = Move(1, 1)
        if (isValidMove(state, centerMove) && isSafe(state, centerMove)) {
            return centerMove
        }

        for (row in 0 .. 2) {
            for (column in 0 .. 2) {
                val move = Move(row, column)
                if (isValidMove(state, move) && isSafe(state, move)) {
                    return move
                }
            }
        }
        return null
    }

    fun isSafe(state: State, move: Move): Boolean {
        state.field[move.row][move.column] = state.nextPlayerSymbol
        state.nextPlayerSymbol = state.nextPlayerSymbol.other()
        val winningMoveOther = WinningMovePlayer().winningMove(state)
        state.field[move.row][move.column] = null
        state.nextPlayerSymbol = state.nextPlayerSymbol.other()
        return winningMoveOther == null
    }
}
