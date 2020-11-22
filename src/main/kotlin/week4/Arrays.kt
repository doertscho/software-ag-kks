package week4

fun main() {

    // Wir kennen schon Listen:
    val numbersList: List<Int> = listOf(4, 14, 581, 173, 183)

    // Arrays sehen auf den ersten Blick sehr ähnlich aus:
    val numbersArray: Array<Int> = arrayOf(5, 148, 13, 184, 1849)

    // Sie können auch so ziemlich alles, was Listen können,
    // z.B. als Eingabe für eine for-Schleife genutzt werden:
    for (x in numbersArray) {
        println(x)
    }
    // ... oder allerlei vordefinierte Funktionen bereitstellen:
    val numbersArraySorted = numbersArray.sorted()
    val listCreatedFromArray: List<Int> = numbersArray.toList()

    // Im Gegensatz zu Listen sind Arrays aber darauf spezialisiert,
    // den Zugriff auf einzelne Werte zuzulassen – sowohl zum Auslesen ...
    val firstValue = numbersArray[0]
    val secondValue = numbersArray[1]

    println(numbersArray.toList())

    // ... als auch zum Überschreiben:
    numbersArray[3] = 32
    numbersArray[0] = 7

    println(numbersArray.toList())
}
