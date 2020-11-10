package week4

fun main() {

    val numbersList: List<Int> = listOf(4, 14, 581, 173, 183)

    val numbersArray: Array<Int> = arrayOf(5, 148, 13, 184, 1849)
    for (x in numbersArray) {
        println(x)
    }
    val numbersArraySorted = numbersArray.sorted()
    val listCreatedFromArray: List<Int> = numbersArray.toList()

    val firstValue = numbersArray[0]
    val secondValue = numbersArray[1]

    println(numbersArray.toList())

    numbersArray[3] = 32
    numbersArray[0] = 7

    println(numbersArray.toList())
}
