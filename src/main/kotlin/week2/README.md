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
Dafür brauchen wir das Schlüsselwort `var`,
allerdings nur bei der ersten Definition des Namens –
bei späterer Neuzuweisung eines anderen Wertes
darf das Schlüsselwort nicht mehr verwendet werden,
denn es wird ein neuer Wert an einen bestehenden Namen gebunden,
es wird kein neuer Name eingeführt. 
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
Schleifen können
für die wiederholte Ausführung dieses Codes verwendet werden.
Dafür bietet Kotlin mehrere Arten von Schleifen,
von denen wir zunächst zwei betrachten:

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

Eine solche Bedingung
kann auf verschieden Weisen definiert werden.
In allen Fällen muss der Ausdruck zu einem Boolean-Wert
aufgelöst werden können – true oder false.
In diesem Fall stehen diese für Antworten auf die Frage:
Soll die Schleife ein weiteres Mal ausgeführt werden –
ja oder nein?

Ein häufiges Beispiel ist die Überprüfung
eines bestimmten Werts am Anfang der Schleife.
Dies ergibt nur dann Sinn,
wenn es sich um einen veränderlichen Wert handelt (siehe oben),
und dieser im Laufe der Schleifenausführung
auch tatsächlich verändert wird.
So wie hier:
```
var x: Int = 1
while (x < 100) {
  x = x * 2
  println("Unser Wert wurde verdoppelt, er steht jetzt bei $x")
}
println("Die Schleife ist beendet!")
```
Dieser Code wird so lange den Wert von `x` verdoppeln
und entsprechende Textausgaben produzieren,
bis ein Wert von über 100 erreicht ist.
Bei der nächsten Überprüfung wird dann festgestellt,
dass die Bedingung nicht mehr erfüllt ist.
Die Ausführung geht dann in der Zeile nach der Schleife weiter.

## Neue Struktur: Verzweigungen

Ähnlich wie eine Schleife funktioniert eine Verzweigung,
die mit den Schlüsselworten `if` und (optional) `else`
definiert wird.
Auch hier wird eine Bedingung definiert.
Ist diese bei der Ausführung des Codes erfüllt,
wird der folgende Block von Code genau einmal ausgeführt.
Ansonsten wird der Block nicht ausgeführt.
Es kann aber ein alternativer Block von Code definiert werden,
der in diesem Fall ausgeführt wird.
Beispiele:
```
// nur ein Block für den positiven Fall:
val zahl: Int = bestimmeZahl()
if (zahl > 5) {
  println("Unsere Zahl ist größer als fünf!")
}
```
```
// Blocks für den positiven und den negativen Fall:
val zahl: Int = bestimmeZahl()
if (zahl < 0) {
  println("Unsere Zahl ist negativ, also kleiner als 0!")
} else {
  println("Unsere Zahl ist positiv!")
}
```

Solche Überprüfungen (für while-Schleifen und if-else-Ausdrücke)
können ebenso durch Funktionsaufrufe definiert werden.
Diese müssen dann einen Boolean-Wert zurückgeben.
```
val x: Int = waehleEineZahl()
if (istPrimzahl(x)) {
  println("Die Zahl $x ist eine Primzahl!")
}
```

**Beispiele: [Loops](Loops.kt), [NimSpiel](NimSpiel.kt)**