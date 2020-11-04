# Zusammenfassung Woche 2

## Neuer Werte-Typ: Boolean

Wir kennen bereits Werte vom Typ `Int`
("integer", englisch für "ganze Zahl")
und Werte vom Typ `String` ("Zeichenkette", also Text).

Diese Woche verwenden wir einen weiteren Typ:
`Boolean` (benannt nach dem Mathematiker George Boole).
Boolean-Werte werden auch als Wahrheitswerte bezeichnet.
Es gibt nur zwei gültige Werte für diesen Typ:
`true` und `false` – wahr und falsch.
In den meisten Fällen lassen sie sich auch verstehen als
"ja" und "nein".

## Neues Schlüsselwort: `var` für veränderliche Werte

Bisher haben wir benannte Werte mit dem Wort `val` eingeleitet,
zum Beispiel: `val meineLieblingsZahl: Int = 42`.
In diesem Fall ist die Zuweisung des Wertes an den Namen fest.
Wir können aber auch erlauben,
dass der einem Namen zugewiesene Wert
zu einem späteren Zeitpunkt verändert wird.
Dafür brauchen wir das Schlüsselwort `var`
bei der ersten Definition des Namens –
bei späterer Neuzuweisung eines anderen Wertes
darf das Schlüsselwort nicht mehr verwendet werden. 
Beispiel:
```
var name: String = "Max"
println("Der Name lautet: $name")
name = "Moritz"
println("Jetzt lautet der Name: $name")

// zum Vergleich: Folgendes geht nicht!
val name: String = "Max"
name = "Moritz"

// Folgendes geht auch nicht, zweimal `var` mit demselben Namen:
var name: String = "Moritz"
var name: String = "Max"
```
Grundsätzlich sollten Werte als unveränderlich definiert werden,
also mit dem Wort `val`.
Nur wenn es notwendig ist, sollte `var` verwendet werden.
Eine Anwendung dafür findet sich im Folgenden.

## Neue Struktur: Schleifen

Ein erstes Konzept für die Strukturierung unseres Codes
kennen wir schon, das sind Funktionen.

Neu in dieser Woche ist das Konzept der Schleifen.
Schleifen haben mit Funktionen gemeinsam,
dass sie einen bestimmten Block von Code 
wiederverwendbar machen.
Schleifen können verwendet werden 
für die wiederholte Ausführung dieses Codes verwendet werden.
Dafür bietet Kotlin zwei Arten von Schleifen:

Mit dem Schlüsselwort `for` wird eine Schleife eingeleitet,
in der Aktionen 
für Werte in einem gegebenen Bereich ausgeführt werden.
Beispiel:
```
for (x in 1 .. 10) {
  val doppelt = x * 2
  println("Das Doppelte von $x ist $doppelt")
}
```
Die einleitende Zeile definiert,
dass der folgende Code je einmal für jede Zahl von 1 bis 10
ausgeführt werden soll.
Der aktuelle Wert soll innerhalb des Code-Blocks
unter dem Namen `x` abrufbar sein.
Dieses Beispiel wird zehn Rechnungen ausführen 
und zehn Zeilen Textausgabe produzieren.

Mit dem Schlüsselwort `while` wird eine Schleife eingeleitet,
bei der nicht von vornherein definiert wird,
wie oft sie ausgeführt wird.
Stattdessen wird eine Bedingung definiert,
und so lange diese erfüllt ist, läuft die Schleife weiter.

[...] (noch unvollständig)