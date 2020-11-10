package week4

enum class NimPlayer {
    Computer,
    Human,
}

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