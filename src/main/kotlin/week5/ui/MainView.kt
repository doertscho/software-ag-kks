package week5.ui

import tornadofx.*

class MainView : View() {

    override val root = vbox {
        add<BoardView>()
        add<PlayerView>()
    }
}