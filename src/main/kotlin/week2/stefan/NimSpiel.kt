package week2.stefan

fun wieVieleHoelzer(gesamt: Int): Int {
    val praeferenz = gesamt % 4
    if (praeferenz in 1 .. 3) {
        return praeferenz
    } else {
        return 1
    }
}
