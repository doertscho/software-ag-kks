package week5.ui

import javafx.beans.property.SimpleObjectProperty
import tornadofx.Component
import tornadofx.ScopedInstance
import tornadofx.awaitUntil
import week5.Move
import week5.Player
import week5.State

class UiPlayer : Player, Component(), ScopedInstance {

    private val clicked = SimpleObjectProperty<Move?>(null)

    fun click(rowNo: Int, columnNo: Int) {
        clicked.set(Move(rowNo, columnNo))
    }

    override fun nextMove(state: State): Move {
        clicked.awaitUntil { it != null }
        val nextMove = clicked.value ?: error("failed to retrieve click")
        clicked.set(null)
        return nextMove
    }
}
