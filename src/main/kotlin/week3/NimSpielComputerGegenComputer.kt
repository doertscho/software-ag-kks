package week3

fun main() {

    var gesamt: Int = 21

    var aktuellerSpieler = 2

    while (gesamt > 0) {

        println("Es gibt noch $gesamt Hölzer")

        if (aktuellerSpieler == 2) {
            aktuellerSpieler = 1
        } else {
            aktuellerSpieler = 2
        }

        val genommen: Int
        if (aktuellerSpieler == 1) {
            genommen = week2.josie.wieVieleHoelzer(gesamt)
        } else {
            genommen = week2.julian.wieVieleHoelzer(gesamt)
        }

        println("Spieler $aktuellerSpieler nimmt $genommen")

        gesamt = gesamt - genommen

        Thread.sleep(2000)
    }

    println("Das Spiel ist beendet, es gewinnt: $aktuellerSpieler")
}