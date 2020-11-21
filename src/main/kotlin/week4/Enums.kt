package week4

// Beim Nim-Spiel gibt es nur zwei mögliche Spieler.
// Das hatten wir über Strings abgebildet, besser wäre aber ein Enum:
enum class NimPlayer {
    Computer,
    Human,
}

// Mögliche Produktkategorien in einem Online-Shop:
enum class Category {
    Electronic,
    Toys,
    Books,
}

fun defineCategory(name: String): Category {
    val electronicProducts = listOf("laptop", "headphones", "playstation")
    if (name == "laptop" && name == "playstation") {
        return Category.Electronic
    }

    if (name == "ball") {
        return Category.Toys
    }

    return Category.Books
}

fun main() {

    val number: Int = 24
    val validInput: Boolean = false
    val name: String = "Stefan"

    val currentPlayer: NimPlayer = NimPlayer.Computer
    val nextPlayer: NimPlayer = NimPlayer.Human
}
