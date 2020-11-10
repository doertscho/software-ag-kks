package week4

interface Greeter {
    fun greet(name: String)
    fun sayGoodBye(name: String)
}

class GermanGreeter : Greeter {
    override fun greet(name: String) {
        println("Hallo, $name!")
    }

    override fun sayGoodBye(name: String) {
        println("Tschüssi, $name!")
    }
}

class EnglishGreeter : Greeter {
    override fun greet(name: String) {
        println("Hi there, $name!")
    }

    override fun sayGoodBye(name: String) {
        println("Goodbye, $name!")
    }
}

fun main() {

    print("Gib bitte deinen Namen ein: ")
    val name = readLine() ?: ""

    val greeter: Greeter = EnglishGreeter()
    greeter.greet(name)

    greeter.sayGoodBye(name)
}
