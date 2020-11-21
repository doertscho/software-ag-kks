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
val myBook = Book("Arthur McAuthor", "The Book Of Doom", 2016)
val titleOfMyBook = myBook.title
```

**Beispiele: [DataClasses](DataClasses.kt), [ChessBoard](ChessBoard.kt)**

## Interfaces und Klassen


