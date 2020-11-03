package week3

fun main() {

    // Listen können mit der Funktion `listOf` explizit definiert werden:
    val festeListe: List<String> = listOf("apple", "pear", "strawberry", "pineapple")
    // Auch eine Liste mit null Elementen ist übrigens eine gültige Liste:
    val leereListe: List<String> = listOf()

    // Listen können aber auch auf viele andere Arten erzeugt werden, hier ein Beispiel:
    // Text-Werte stellen die Funktion `split` bereit, die aus einem zusammenhängenden
    // Text eine Liste von Teil-Texten macht, z.B. einzelnen Worten.
    print("Bitte gib ein paar Worte ein, getrennt durch Leerzeichen: ")
    val textEingabe: String = readLine() ?: ""
    val listeVonWorten: List<String> = textEingabe.split(" ")

    var bisherLaengstesWort: String = ""
    for (wort in listeVonWorten) {
        if (wort.length > bisherLaengstesWort.length) {
            bisherLaengstesWort = wort
        }
    }
    println("Das längste Wort ist: $bisherLaengstesWort")

    val drittesWort = listeVonWorten.get(2)
    println("Das dritte Wort ist: $drittesWort")

    val sortiert = listeVonWorten.sorted()
    println("In alphabetischer Reihenfolge: $sortiert")
}
