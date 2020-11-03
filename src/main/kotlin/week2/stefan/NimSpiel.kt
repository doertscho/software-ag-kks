package week2.stefan

fun wieVieleHoelzer(gesamt: Int): Int {
    val preferred = gesamt % 4
    if (preferred in 1 .. 3) {
        return preferred
    } else {
        return 1
    }
}
