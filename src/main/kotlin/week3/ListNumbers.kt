package week3

fun main() {

    // Zur Wiederholung: Hier ein einfacher Typ, auch genannt "primitiver" Typ:
    val zahl: Int = 21

    // Neu: Ein komplexerer Typ, die Liste.
    // In den spitzen Klammern wird definiert, welchen Typ die Elemente haben.
    val listeVonZahlen: List<Int> = listOf(21, 4, 26, 12, 11, 0, 4, 34, 141, 57, 424)

    // Listen können als Eingaben für Schleifen verwendet werden:
    var bisherGroessteZahl: Int = -1
    for (x in listeVonZahlen) {
        if (x > bisherGroessteZahl) {
            bisherGroessteZahl = x
        }
    }
    println("Die größte Zahl ist: $bisherGroessteZahl")

    var summe: Int = 0
    for (x in listeVonZahlen) {
        summe = summe + x
    }
    println("Die Summe ist: $summe")

    // Aber Listen stellen auch selbst eine ganze Reihe von Standardfunktionen bereit:
    val sortierteZahlen: List<Int> = listeVonZahlen.sorted()

    val primzahlen: List<Int> = listeVonZahlen.filter { x ->
        week2.istPrimzahl(x)
    }
    println("Primzahlen: $primzahlen")
}
