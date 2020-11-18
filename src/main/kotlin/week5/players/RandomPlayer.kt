package week5.players

import week5.Move
import week5.Player
import week5.State

class RandomPlayer : Player {

    override fun nextMove(state: State): Move {
        val row = (0..2).random()
        val column = (0..2).random()
        return Move(row, column)
    }
}
