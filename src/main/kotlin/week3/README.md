# Zusammenfassung Woche 3

## Referenzen in andere Pakete

Mit ein paar wenigen Anpassungen
können wir die verschiedenen entwickelten Computerspieler
das Nim-Spiel gegeneinander spielen lassen.
Wir könnten dafür die jeweiligen Funktionen
in die gleiche Datei kopieren.
Oft ist es aber sauberer oder übersichtlicher,
verschiedene Funktionen auf verschiedene Dateien aufzuteilen.
Sie können dann aus anderen Dateien referenziert werden,
indem der entsprechende Ablageort, mit Punkten getrennt,
dem Namen vorangestellt werden.

Beispiele dafür findet ihr in der Datei
`NimSpielComputerGegenComputer`.
In diesem Fall sind die Funktionen
nach den jeweiligen Verfasser*innen gruppiert.
In größeren Software-Systemen werden oft verschiedene
Funktionen oder Bereiche auf diese Weise gruppiert.

## Neuer Werte-Typ: Listen

Bisher haben wir jeweils mit Werte-Typen gearbeitet,
die jeweils einen einzelnen Wert ausdrücken.
Diese Typen (z.B. Zahlen oder Wahrheitswerte)
werden auch als primitive Datentypen bezeichnet –
sie stellen praktisch die Grundbausteine dar.
Unsere Möglichkeiten werden aber um ein Vielfaches erweitert,
wenn wir diese Typen dynamisch kombinieren.
Die erste Möglichkeit dafür sind Listen.

Listen enthalten eine beliebige Zahl von konkreten Werten.
Bei der Deklaration eines Listen-Werts kann definiert werden,
welchen Typ die Elemente haben.
Für eine Liste von ganzen Zahlen (Typ "Int")
sieht das zum Beispiel so aus:
```
val listeVonZahlen: List<Int> = listOf(5, 14, 3, 8, 0)
```

Der große Vorteil von dynamischen Datentypen wie Listen ist,
dass wir nun Code schreiben können,
der unabhängig von der Menge an Daten funktioniert.
Wenn wir an einer Stelle in unserem Code definieren,
dass ein bestimmter Wert zum Beispiel
vom Typ "Liste von Zahlen" ist,
stellt Kotlin sicher,
dass der Code für jegliche solche Liste funktioniert –
sei es eine Liste mit 3, 1000 oder einer Million Werten,
oder auch eine leere Liste ohne Inhalt.

Listen können als Eingabemenge für `for`-Schleifen
verwendet werden.
In bisherigen Beispielen haben wir definiert,
dass die Schleife beispielsweise 
für alle Werte zwischen 1 und 20 ausgeführt werden soll.
Genau so können wir nun angeben,
dass die Schleife 
für alle Werte in einer Liste ausgeführt werden soll:
```
val meineLieblingsZahlen: List<Int> = listOf(3, 4, 12, 24, 27)
for (x in meineLieblingsZahlen) {
  println("$x ist eine meiner Lieblingszahlen!")
}
```

Durch die Kombination einer solchen `for`-Schleife
mit veränderlichen Helfer-Variablen
können wir die Werte in unserer Liste untersuchen,
ohne dass wir vorher wissen müssen,
welche oder wie viele Werte darin stehen:
```
val listeVonZahlen: List<Int> = listOf(21, 4, 26, 12, 11, 0, 4, 34, 141, 57, 424)

var bisherGroessteZahl: Int = -1
for (x in listeVonZahlen) {
    if (x > bisherGroessteZahl) {
        bisherGroessteZahl = x
    }
}
println("Die größte Zahl in der Liste ist: $bisherGroessteZahl")
```

## Neues Konzept: Objektorientierte Aufrufe



## Neuer Werte-Typ: Maps


