package week1

fun berechneTaeglichenVerbrauch(verbrauch: Double, stundenProTag: Double): Double {
    return verbrauch * stundenProTag
}

fun berechneJaehrlichenVerbrauch(verbrauch: Double, stundenProTag: Double): Double {
    return 365 * berechneTaeglichenVerbrauch(verbrauch, stundenProTag)
}

fun berechneJaehrlichenVerbrauchKWH(verbrauch: Double, stundenProTag: Double): Double {
    return berechneJaehrlichenVerbrauch(verbrauch, stundenProTag) / 1000.0
}

val preisProKWH = 0.3
fun berechnePreisProJahr(verbrauch: Double, stundenProTag: Double): Double {
    return berechneJaehrlichenVerbrauchKWH(verbrauch, stundenProTag) * preisProKWH
}

fun berechnePreis(gesamtVerbrauchKWH: Double): Double {
    return gesamtVerbrauchKWH * preisProKWH
}

val co2ProKWH = 0.4
fun berechneCO2(gesamtVerbrauchKWH: Double): Double {
    return gesamtVerbrauchKWH * co2ProKWH
}

fun main() {

    print("Gib den Verbrauch deines Elektrogeräts ein (in Watt): ")
    val verbrauch: Double = readLine()?.toDouble() ?: 0.0
    print("Wie lang ist das Gerät jeden Tag in Betrieb? (in Stunden): ")
    val stundenProTag: Double = readLine()?.toDouble() ?: 0.0

    print("Der jährliche Verbrauch (in KWH) ist: ")
    val jaehrlicherVerbrauchKWH = berechneJaehrlichenVerbrauchKWH(verbrauch, stundenProTag)
    println(jaehrlicherVerbrauchKWH)

    print("Der Preis in einem Jahr beträgt: ")
    val jaehrlicherPreis = berechnePreis(jaehrlicherVerbrauchKWH)
    println(jaehrlicherPreis)

    print("Der jährliche CO2-Verbrauch beträgt: ")
    val jaehrlichesCO2 = berechneCO2(jaehrlicherVerbrauchKWH)
    println(jaehrlichesCO2)
}
