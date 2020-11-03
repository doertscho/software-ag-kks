package week3

fun main() {

    val kontaktliste: MutableMap<String, Int> = mutableMapOf()

    while (kontaktliste.size < 3) {
        print("Bitte gib einen Namen ein: ")
        val name = readLine() ?: ""
        print("Bitte gib die Nummer ein: ")
        val nummer = readLine()?.toInt() ?: 0
        kontaktliste.put(name, nummer)
    }

    while (true) {
        print("Um einen Namen nachzuschlagen, gib ihn ein: ")
        val suchEingabe = readLine() ?: ""
        val nummer = kontaktliste.get(suchEingabe)
        println("Die Nummer von $suchEingabe ist: $nummer")
    }
}
