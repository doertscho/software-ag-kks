package week1

fun addiere(x: Int, y: Int): Int {
    return x + y
}

fun multipliezere(a: Int, b: Int): Int {
    return a * b
}

fun main() {

    print("Gib eine Zahl ein: ")
    val ersteTextEingabe: String = readLine() ?: "0"
    val ersteZahl = ersteTextEingabe.toInt()

    val dritteZahl = 45
    addiere(ersteZahl, dritteZahl)
    addiere(12, 56)
    addiere(45, dritteZahl)

    print("Gib eine zweite Zahl ein: ")
    val zweiteTextEingabe: String = readLine() ?: "0"
    val zweiteZahl = zweiteTextEingabe.toInt()

    print("Das Produkt dieser Zahlen ist: ")
    val produkt = multipliezere(ersteZahl, zweiteZahl)
    println(produkt)
}
