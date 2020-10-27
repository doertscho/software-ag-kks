package week2

fun istTeiler(basis: Int, moeglicherTeiler: Int): Boolean {
    val rest = basis % moeglicherTeiler
    return rest == 0
}

fun istPrimzahl(x: Int): Boolean {

    val vorgaenger = x - 1
    for (potentiellerTeiler in 2 .. vorgaenger) {
        if (istTeiler(x, potentiellerTeiler)) {
            return false
        }
    }
    return true
}

fun findePrimzahlenZwischenEinsUndZweihundert() {

    for (x in 1 .. 200) {
        if (istPrimzahl(x)) {
            println("$x ist eine Primzahl")
        }
    }
}

fun eingabeDauerschleife() {

    while (true) {
        print("Gib eine Zahl ein: ")
        val zahl = readLine()?.toInt() ?: 0
        if (istPrimzahl(zahl)) {
            println("$zahl ist eine Primzahl!")
        } else {
            println("$zahl ist KEINE Primzahl!")
        }
    }
}

fun schleifenBeispiele() {

    // Das hier ist eine for-Schleife:
    for (x in 0 .. 10) {
        val doppelt = x * 2
        println(doppelt)
    }

    var x: Int = 0
    while (x < 20) {
        val doppelt = x * 2
        println(doppelt)

        x = x + 1
    }
}

/*
 Alles, was zwischen diesen Symbolen steht, ist ein Kommentar.
 Es wird von Kotlin ignoriert. Nutzt es für Anmerkungen oder Erinnerungen.
 Das folgende ist meine Hauptfunktion:
 */
fun main() {

    findePrimzahlenZwischenEinsUndZweihundert()

//    eingabeDauerschleife()
//    schleifenBeispiele()
}
