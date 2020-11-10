package week4

fun wordMix(input: String): String {

    val words: List<String> = input.split(" ")
    val mixedWords = words.shuffled()
    val result: String = mixedWords.joinToString(" ")
    return result
}

fun main() {

    print("Gib einen Satz ein: ")
    val input = readLine() ?: ""
    val mixed = wordMix(input)
    println(mixed)
}
