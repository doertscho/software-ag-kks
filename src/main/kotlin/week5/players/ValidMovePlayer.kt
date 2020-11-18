package week5.players

import week5.Move
import week5.Player
import week5.State
import week5.isValidMove

class ValidMovePlayer : Player {

    override fun nextMove(state: State): Move {

        val validMove = findValidMove(state)
        if (validMove != null) {
            return validMove
        }

        return Move(0, 0)
    }

    fun findValidMove(state: State): Move? {
        for (row in 0 .. 2) {
            for (column in 0 .. 2) {
                val move = Move(row, column)
                if (isValidMove(state, move)) {
                    return move
                }
            }
        }
        return null
    }
}
