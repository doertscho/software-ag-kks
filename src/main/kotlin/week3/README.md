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

[...]

(noch unvollständig)
