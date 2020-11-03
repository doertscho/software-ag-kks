package week2.zufall

import kotlin.random.Random
import kotlin.random.nextInt

fun wieVieleHoelzer(gesamt: Int): Int {
    return Random.nextInt(1 .. 3)
}
