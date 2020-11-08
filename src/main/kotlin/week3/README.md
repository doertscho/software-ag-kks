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

**Beispiele: 
[NimSpielComputerGegenComputer](NimSpielComputerGegenComputer.kt)**

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

**Beispiele: [ListNumbers](ListNumbers.kt), [ListText](ListText.kt)**

## Neues Konzept: Objektorientierte Aufrufe

Für die Arbeit mit Listen (wie auch mit anderen Typen)
stellt Kotlin eine große Menge an Standard-Funktionen bereit.
Ein paar Beispiele:
```
val listeVonZahlen: List<Int> = listOf(5, 1, 57, 23, 1, 11, 31)
val sortierteListe = listeVonZahlen.sorted()
val groesstesElement = listeVonZahlen.max()
val zufaelligAusgewaehltesElement = listeVonZahlen.random()
```

Es fällt auf:
Verglichen mit dem bekannten Format von Funktionsaufrufen (`funktionsName(eingabeWert)`)
wird hier eine andere Reihenfolge verwendet (`wert.funktionsName()`).
Dies wird auch als objektorientierter Funktionsaufruf bezeichnet.
Es besteht kein grundsätzlicher Unterschied zwischen beiden Arten,
und in vielen Fällen wäre es uns ohne Weiteres möglich,
die Funktionen auch auf die jeweils andere Weise zu definieren.
Die feinen Unterschiede lernen wir noch kennen.

In erster Linie ist es Geschmackssache und persönliches Ermessen,
ob die eine oder andere Art der Definition für eine Funktion sinnvoller ist.
Die objektorientierte Variante wird in der Regel dann verwendet,
wenn eine Funktion ganz klar im Kontext eines konkreten Wertes zu sehen ist.
Steht eine Funktion für sich und hat mehrere Eingabewerte,
wird tendenziell eher die bisher bekannte Variante verwendet.

Auch für objektorientierte Funktionsaufrufe
können aber weitere Eingabewerte erforderlich sein.
Beispiel: Die Funktion, die einen Text in eine Liste von Texten zerlegt,
anhand eines bestimmten Trennzeichens.
Diese wird im Kontext des Text-Wertes objektorientiert aufgerufen,
benötigt aber einen weiteren Eingabewert, nämlich das zu verwendende Trennzeichen.
```
val eingabeText: String = "wort,hallo,apfel,birne,zitrone"
val trennzeichen = ","
val einzelneWorte: List<String> = eingabeText.split(trennzeichen)
```

## Neuer Werte-Typ: Maps

Listen enthalten eine Menge von Werten in einer definierten Ordnung.
Für eine strukturierte Verwaltung von mehreren Werten
eignen sie sich aber eher nicht.
Hierfür gibt es viele bessere Typen.
Ein sehr häufig verwendeter sind Maps.
In einer solchen Map wird einer Menge von Schlüssel-Werten
jeweils ein Wert zugeordnet.
Dabei können sowohl Schlüssel als auch die zugeordneten Werte
von beliebigen Typen sein.

Maps werden manchmal auch als Dictionaries bezeichnet – Wörterbücher.
Daraus ergibt sich ein offensichtliches Beispiel für die Verwendung von Maps,
das allerdings nur eine von unendlich vielen Möglichkeiten darstellt.
Bei der Angabe des Typs wird jeweils der Typ der Schlüssel und der Werte angegeben,
in diesem Fall sind beides Texte, also "Strings":
```
val woerterbuch: Map<String, String> = mapOf(
  "hund" to "dog",
  "katze" to "cat",
  "pferd" to "horse"
)
val englischFuerKatze = woerterbuch.get("katze")
```

Wird eine Map so definiert wie in diesem Beispiel,
enthält sie die Werte, die bei der Definition angegeben sind,
und ist ab dann unveränderlich.
Maps können aber auch als veränderlich definiert werden,
sodass im weiteren Verlauf des Programms neue Einträge hinzugefügt werden können
(durch Aufruf der Funktion `put(schluessel, wert)`).
Dafür steht das englische Wort "mutable" – veränderlich.
```
val woerterbuch: MutableMap<String, String> = mutableMapOf() // anfangs leer
woerterbuch.put("hund", "dog")
woerterbuch.put("katze", "cat")
val englischFuerKatze = woerterbuch.get("katze")
```

**Beispiele: [Maps](Maps.kt), [PhoneBook](PhoneBook.kt)**