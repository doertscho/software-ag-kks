package week3

fun main() {

    // Maps (auch genant Dictionaries oder Key-Value-Maps) weisen einer Menge
    // von Schlüssel-Werten jeweils einen anderen Wert zu.
    // Dabei muss angegeben werden, ob die Map nachträglich veränderbar (mutable) sein soll.
    val woerterbuch: MutableMap<String, String> = mutableMapOf()
    woerterbuch.put("hund", "dog")
    woerterbuch.put("katze", "cat")
    woerterbuch.put("pferd", "horse")

    // Soll die Map nicht veränderbar sein, kann sie so definiert werden:
    val woerterbuch2: Map<String, String> = mapOf(
            "hund" to "dog",
            "katze" to "cat",
            "pferd" to "horse"
    )
    // (ein Aufruf woerterbuch2.put("vogel", "bird") wäre hier nicht möglich!)

    val englischFuerKatze = woerterbuch.get("katze")
    println("Das englische Wort für Katze ist: $englischFuerKatze")

    // Sowohl für Schlüssel als auch für zugewiesene Werte können beliebige Typen
    // verwendet werden – beispielsweise auch wiederum Maps:
    val verschachtelt: Map<String, Map<String, String>> = mapOf(
            "hund" to mapOf(
                    "englisch" to "dog",
                    "französisch" to "chien",
                    "spanisch" to "perro"
            )
    )
}
