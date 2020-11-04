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