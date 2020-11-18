package week5.ui

import javafx.application.Platform
import javafx.stage.Stage
import tornadofx.*
import week5.Player
import week5.State
import week5.Symbol
import week5.players.LookAheadPlayer
import week5.runGame

class TicTacToeUI : App(MainView::class) {

    private val stateContainer: StateContainer by inject()
    private val uiPlayer: UiPlayer by inject()

    override fun start(stage: Stage) {
        super.start(stage)

        val players: Map<Symbol, Player> = mapOf(
            Symbol.O to LookAheadPlayer(),
            Symbol.X to uiPlayer,
        )

        Platform.runLater {
            runGame(stateContainer.state, players)
        }
    }
}

class StateContainer : Component(), ScopedInstance {
    val state = State()
}

fun main() {
    launch<TicTacToeUI>()
}
