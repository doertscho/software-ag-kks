package week2

// Diese Funktion ist unser Computerspieler.
// In jeder Runde wird diese Funktion aufgerufen.
// Als Eingabe erhält die Funktion die Zahl der verbleibenden Hölzer.
// Der Rückgabewert gibt an, wie viele Hölzer genommen werden.
fun wieVieleHoelzer(gesamtZahl: Int): Int {

    // Die simpelste Lösung: Wir geben einfach immer dieselbe Zahl aus.
    return 2
}

fun main() {

    var gesamt: Int = 21

    var aktuellerSpieler = "computer"

    while (gesamt > 0) {

        println("Es gibt noch $gesamt Streichhölzer.")

        val genommen: Int
        if (aktuellerSpieler == "computer") {
            genommen = wieVieleHoelzer(gesamt)
            println("Computer nimmt $genommen Hölzchen")
            aktuellerSpieler = "mensch"
        } else {
            print("Wie viele Streichhölzer möchtest du nehmen? ")
            genommen = readLine()?.toInt() ?: 1
            aktuellerSpieler = "computer"
        }

        gesamt = gesamt - genommen
    }

    println("Das Spiel ist beendet!")
    if (aktuellerSpieler == "computer") {
        println("Du hast gewonnen!")
    } else {
        println("Der Computer hat gewonnen!")
    }
}
