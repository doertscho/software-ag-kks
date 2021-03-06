# Zusammenfassung Woche 4

Diese Woche lernen wir neue Möglichkeiten
für die sogenannte "Datenmodellierung" kennen –
die strukturierte Beschreibung der Werte,
mit denen wir arbeiten wollen.
Wir kennen schon die Basis-Datentypen
`Int` (Zahlen), `String` (Texte) und `Boolean` (Wahrheitswerte).
Außerdem haben wir schon Listen und Maps verwendet.
Diese Woche kommen ein paar weitere Konzepte dazu.

## Enumerationen

Durch die Schlüsselworte `enum class` können wir
einen eigenen Datentypen definieren,
der eine feste, abgeschlossene Menge von möglichen Werten umfasst.
Diese nennen sich auch Enumerationen.
Sie sind immer dann nützlich, wenn wir wissen,
dass in einer Situation
nur ganz bestimmte Werte sinnvoll möglich sind.

```
// Definition möglicher Produkt-Kategorien in einem Online-Shop:
enum class Category {
    Electronics,
    Toys,
    Sports,
    Household,
    Books,
    Clothing
}

// Definition der Spielfigur-Arten beim Schach:
enum class ChessPieceType {
    Queen,
    King,
    Bishop,
    Rook,
    Knight,
    Pawn
}
```

Wenn ein Wert vom Typ einer bestimmten Enumeration sein soll,
wir aber einen Wert zuweisen,
der nicht als gültiger Wert definiert wurde,
dann wird Kotlin dies automatisch als Fehler erkennen.

**Beispiele: [Enums](Enums.kt), [ChessBoard](ChessBoard.kt)**

## Datenklassen

Die Schlüsselworte `data class` leiten die Definition
einer sogenannten "Datenklasse" ein.
Diese können wir dafür nutzen, Werte auszudrücken,
die aus mehreren Bestandteilen zusammengesetzt sind.
Für jeden dieser Teil-Werte muss festgelegt werden,
welchen Typ dieser hat.

```
// Daten einer Person, z.B. in einer Kontaktliste:
data class Person {
    val firstName: String,
    val lastName: String,
    val yearOfBirth: Int,
    val telephoneNumber: Int,
    val emailAddress: String
}

// Informationen über ein Buch, z.B. für eine Bibliotheks-Verwaltung:
data class Book {
    val author: String,
    val title: String,
    val publicationYear: Int
}
```

Bei der Zuweisung eines solchen komplexen Werts
müssen entsprechend die definierten Bestandteile angegeben werden,
später können diese wiederum einzeln abgefragt werden.

```
val myBook: Book = Book("Arthur McAuthor", "The Book Of Doom", 2016)
val titleOfMyBook: String = myBook.title
```

**Beispiele: [DataClasses](DataClasses.kt), [ChessBoard](ChessBoard.kt)**

## Interfaces und Klassen

Mit den bisherigen Konzepten haben wir Möglichkeiten erhalten,
die Struktur von Daten zu beschreiben.
Kotlin bietet uns aber auch Wege,
Abläufe abstrakt zu beschreiben.
Das wohl wichtigste Mittel hierfür sind Interfaces und Klassen.

Über ein Interface können wir festlegen,
welche Funktionen wir an einer bestimmten Stelle im Code benötigen,
ohne uns an dieser Stelle Gedanken darüber zu machen,
wie genau diese umgesetzt werden.
Eine Klasse stellt dann das Gegenstück zu einem Interface dar –
sie befolgt die Vorgaben, die das Interface, definiert,
und liefert zur einer vorgeschriebenen Funktion
die konkrete Umsetzung.

```
// Das Interface legt fest, was ein "Grüßer" können soll –
// nämlich jemandem mit gegebenem Namen Hallo sagen
interface Greeter {
    fun sayHello(name: String)
}

// Eine Klasse, die wie folgt definiert wird, signalisiert,
// dass sie das Interface "Greeter" befolgt.
class GermanGreeter : Greeter {
    // Sie bietet eine konkrete Umsetzung des "Hallo-Sagens",
    // hier in deutscher Sprache:
    fun sayHello(name: String) {
        println("Guten Morgen, $name!")
    }
}

// Eine andere Klasse kann das Hallo-Sagen auf andere Weise umsetzen:
class EnglishGreeter : Greeter {
    fun sayHello(name: String) {
        println("Hello there, $name!")
    }
}
```

Eine derartige Strukturierung des Codes hat den Vorteil,
dass wir das "was soll gemacht werden"
vom "wie soll es gemacht werden" trennen können.
Zu jedem Interface können bei Bedarf mehrere Klassen definiert werden,
die die geforderten Funktionen auf unterschiedliche Weise umsetzen.
Sie können dann je nach Bedarf ausgetauscht werden,
ohne den Code verändern zu müssen, der die Funktionen benutzt.

```
fun main() {

    print("Wie lautet dein Name? ")
    val name = readLine() ?: "Inkognito"

    print("Wähle eine Sprache: [1] für Deutsch, [2] für Englisch: ")
    val selection = readLine() ?: "1"
    
    // Wir wollen einen Greeter – welcher, ist uns eigentlich egal
    val greeter: Greeter
    if (selection == "1") {
        greeter = GermanGreeter()
    } else {
        greeter = EnglishGreeter()
    }

    // Wir wissen, dass beide Klassen die Methode "sayHello"
    // bereitstellen, darum können wir sie hier einfach benutzen:
    greeter.sayHello(name)
}
```

Zu Klassen gibt es noch sehr viel mehr zu wissen,
das werden wir in den folgenden Wochen nach und nach kennen lernen.

**Beispiele: [InterfacesClasses](InterfacesClasses.kt)**

## Arrays

Wir kennen bereits Listen,
die eine Menge von verschiedenen Werten
in festgelegter Reihenfolge enthalten.
Eine ähnliche Datenstruktur sind Arrays,
auch sie enthalten eine Menge von Werten
in festgelegter Reihenfolge.
Im Unterschied zu Listen sind Arrays jedoch darauf spezialisiert,
auf die Werte jeweils einzeln zuzugreifen
und sie gegebenenfalls auch einzeln zu verändern.
Anstelle einer Auflistung von Werten
könnt ihr euch Arrays also eher 
als eine Reihe von Schubladen vorstellen,
die jeweils einen Wert enthalten.

```
val arrayOfNumbers: Array<Int> = arrayOf(14, 11, 14, 184, 58)

// Wir fangen bei 0 an zu zählen – der erste Wert hat Index 0
val theFirstValue: Int = arrayOfNumbers[0]
val theSecondValue: Int = arrayOfNumbers[1]

// Wir können einzelne Einträge gezielt verändern:
val oldFourthValue = arrayOfNumbers[3] // das ist 184
arrayOfNumbers[3] = 571
val newFourthValue = arrayOfNumbers[3] // das ist 571
```

Arrays können ineinander verschachtelt werden,
um zweidimensionale Strukturen abzubilden
(oder auch drei- oder höherdimensionale).
Ein Array, dessen einzelne Einträge wiederum Arrays sind,
kann so verwendet werden,
um beispielsweise eine quadratisch angeordnetes Spielfeld
mit Reihen und Spalten abzubilden.

```
val sudokuCell: Array<Array<Int>> = arrayOf(
    arrayOf(5, 1, 4),
    arrayOf(2, 3, 9),
    arrayOf(7, 8, 6)
)
// Zugriff auf die zweite Zeile, drittes Feld:
// (Erinnerung, es wird jeweils bei 0 angefangen zu zählen!)
val middleRight: Int = sudokuCell[1][2]
```

**Beispiele: [Arrays](Arrays.kt), [ChessBoard](ChessBoard.kt)**

## Nullable Types

Egal, an welcher Stelle Werte oder Variablen auftauchen,
oft ist es nützlich oder erforderlich, anzugeben,
dass an dieser Stelle kein richtiger Wert steht.
Das kann daran liegen, dass der Wert noch nicht bekannt ist,
oder dass es keinen gibt.
Viele Programmiersprachen lassen dies ohne gesonderte Absicherung zu,
dies hat allerdings immer wieder zu Problemen geführt.
Kotlin erfordert darum eine ausdrückliche Angabe,
ob solche "leeren" Werte möglich sein sollen.

Der Ausdruck für einen solchen leeren Wert in Kotlin ist `null` –
und zwar gleichermaßen für alle Datentypen.
Es wird daher auch als Nullwert bezeichnet.
`null` darf nicht verwechselt werden mit der Zahl `0`
oder mit dem Text `"null"`,
nur ausgeschrieben und ohne Anführungszeichen
bezeichnet es den leeren Wert.

Bei der Angabe eines Wert-Typen
(bei der Definition eines benannten Werts, einer Variablen,
oder in der Signatur einer Funktion)
muss explizit angegeben werden,
ob Nullwerte zugelassen werden sollen.
Falls ja, muss dem Typen ein `?` angehängt werden.
Falls nein, wenn der Typ als ohne `?` angegeben wird,
wird Kotlin jede Situation,
in der ein Nullwert zugewiesen wird oder zugewiesen werden könnte,
als Fehler melden.
Wird ein Fragezeichen angehängt,
bezeichnet man den Typen auch als "Nullable Type".

```
// hier dürfte NICHT null zugewiesen werden:
val text1: String = "ababa abaca accacaca"
// hier darf null zugewiesen werden, oder ein tatsächlicher Wert:
val text2: String? = null
val text3: String? = "hallo welt"

// ACHTUNG: null ist nicht zu verwechseln mit ...
val number: Int = 0                 // ... der Zahl 0
val text: String = "null"           // ... dem Text "null" (vier Buchstaben)
val booleanValue: Boolean = false   // ... dem Wahrheitswert "falsch"
val text: String = ""               // ... dem leeren Text (mit null Buchstaben)
val list: List<String> = listOf()   // ... einer leeren Liste (mit null Elementen)
```

Taucht an einer Stelle ein "null-barer" Wert auf,
es wird aber für die weitere Verwendung
ein nicht-null-barer Wert benötigt,
gibt es mehrere Möglichkeiten zur Umwandlung.
Es kann mit den Zeichen `?:` ein Standardwert angegeben werden,
der verwendet wird, falls ein Nullwert vorliegt.
Auch kann Kotlin angewiesen werden,
in diesem Fall einen Fehler auszugeben.
Manche Typen definieren auch weitere Hilfsfunktionen.

```
val nullableText1: String? = null
val nullableText2: String? = "hier steht tatsächlich text"
val text1: String = nullableText1 ?: "standard"
val text2: String = nullableText2 ?: "standard"
// text1 wird nun den Wert "standard" enthalten,
// text2 jedoch den Text, der in nullableText2 steht.

// Kotlin kann auch angewiesen werden, bei Null-Werten einen Fehler zu werfen:
val input: String? = readLine()
val safeInput: String = input ?: error("input was null!")

// Manche Datentypen bieten weitere Funktionen, z.B. Listen:
val nullableList: List<Int>? = null
// Die folgende Funktion verwendet eine leere Liste,
// falls der Ursprungswert null ist:
val list: List<Int> = nullableList.orEmpty()
// Dieser Funktionsaufruf ist identisch mit folgender Schreibweise:
val list2: List<Int> = nullableList ?: listOf()
```

**Beispiele: [ChessBoard](ChessBoard.kt)**
