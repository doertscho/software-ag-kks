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


