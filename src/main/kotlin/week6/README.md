# Zusammenfassung Woche 6

In dieser Woche geht es weniger um neue Programmierkonzepte,
stattdessen lernen wir das diesjährige Spiel
der Software-Challenge kennen
und Arbeitsweisen für die Zusammenarbeit in den Teams.

## Das Spiel Blokus

Bei der diesjährigen Software-Challenge
soll ein Computerspieler für das Spiel Blokus entwickelt werden.
In diesem Spiel gibt es ein Spielfeld von 20x20 Feldern
und Spielsteine in vier Farben,
jeweils in verschiedenen Formen und Größen.
Im Wettbewerb kontrolliert eine Seite jeweils zwei Farben,
so dass stets zwei künstliche Spieler oder Menschen
gegeneinander spielen.

Der jeweils erste Stein jeder Farbe muss dabei so gelegt werden,
dass er an eine der vier Ecken des Spielfelds angrenzt.
Ab dann dürfen Steine so gelegt werden,
dass sie einen Stein der gleichen Farbe an mindestens einer Ecke,
aber nicht an einer Seite berühren.
Jeder abgelegte Stein zählt so viele Punkte,
wie er Felder belegt.
Um zu gewinnen, müssen die Steine also möglichst so platziert werden,
dass für alle eigenen Steine ein Platz zum Ablegen gefunden wird,
der gegnerischen Seite aber der Platz zum Ablegen blockiert wird.

Unter https://github.com/CAU-Kiel-Tech-Inf/gui/releases
kann die von den Betreuern des Wettbewerbs bereitgestellte
grafische Oberfläche für das Spiel heruntergeladen werden.
Wählt die neuste Version der `.jar`-Datei für euer Betriebssystem
(Windows, Mac oder Linux).
Starten könnt ihr das Programm entweder
durch einen einfachen Doppelklick
oder über die Kommandozeile 
mit dem Befehl `java -jar <hier der dateiname>.jar`. 

Wenn ihr ein neues Spiel startet,
könnt ihr auswählen,
wer die beiden Seiten kontrollieren soll.
Ihr könnt selbst über die Oberfläche spielen,
ihr könnt den Standard-Computerspieler spielen lassen
(mit zufälligen Zügen)
oder euren eigenen Computerspieler auswählen.
Dazu gleich mehr.

## Versionsverwaltung mit Git

Die strukturierte Verwaltung von Programmcode
ist schon in den einfachsten Fällen sinnvoll.
Sobald ihr mit mehreren Personen
an komplexeren Programmen arbeitet
und diese über die Zeit immer weiter verändert,
ist eine gute Organisation unbedingt erforderlich.

Hierbei hilft uns Git,
ein sogenanntes Versionsverwaltungssystem.
Wenn ihr die Dateien eures Programms mit Git verwaltet,
stellt dies quasi eine übergeordnete Ebene
über dem normalen Dateisystem eures Computers dar.
Git speichert alle Zwischenstände und Änderungen,
sodass ihr auf leichte Weise ältere Versionen
wiederherstellen könnt,
eure Änderungen mit anderen Teammitgliedern teilen könnt,
und verschiedene Ansätze parallel ausprobieren könnt. 
Außerdem erlaubt es euch,
automatisch Sicherungskopien eurer Arbeit anzulegen.

Eine Menge von zusammengehörigen Dateien,
die von Git verwaltet werden
(in der Regel der Code eines bestimmten Projekts),
wird als *Repository* (oder kurz Repo) bezeichnet.
Von einem solchen Repo gibt es in der Regel
immer mehrere, miteinander vernetzte Kopien.
In unserem Fall wird jedes Team eine zentrale Kopie
im Internet (bei der Plattform GitHub) haben
und jedes Mitglied eine lokale Kopie auf dem eigenen Rechner.

Nachdem ihr Änderungen am Code vorgenommen habt,
könnt ihr Git anweisen,
diese ins System zu übernehmen.
Dies wird als *Commit* bezeichnet.
Ein solcher Commit sollte stets logisch zusammenhängende
Änderungen umfassen.
Wenn ihr beispielsweise eine neue Idee umsetzt,
die Ergänzungen in drei verschiedenen Dateien umfasst,
sollten diese in einem Commit zusammengefasst werden.
Genau so kann es aber sein,
dass ein sinnvoller Commit nur eine kleine Änderung
in einer einzigen Zeile umfasst,
sofern diese Änderung für sich steht.
Wie viel oder wie wenig ihr in einem Commit zusammenfasst,
ist euch überlassen.

Nachdem ihr eure Änderungen in einem oder mehreren Commits
in euer lokales Git-System übernommen habt,
könnt ihr diese mit einem Befehl (einem sogenannten *Push*)
an das zentrale Repository übertragen.
Ebenso könnt ihr euch mit einem anderen Befehl (dem *Pull*)
alle Änderungen aus dem zentralen Repository herunterladen,
die dort von anderen hinterlegt wurden.
Auf diese Weise könnt ihr eure Arbeit
mit den anderen Mitgliedern austauschen
und seid stets auf dem neusten Stand.
Git kann dabei intelligent mit den Änderungen umgehen.
Auch wenn zwei verschiedene Personen zeitgleich Änderungen
an derselben Datei vorgenommen haben,
kann Git diese in der Regel sinnvoll kombinieren
und so allen den resultierenden Zustand bereitstellen.

Ein weiteres wichtiges Konzept der Versionsverwaltung
sind *Branches* (auf Deutsch "Zweige" oder "Verzweigungen").
Branches könnt ihr euch als parallel existierende Varianten
eures Codes vorstellen.
In jedem Repository gibt es einen Haupt-Zweig (main branch),
der den aktuellsten,
für gut befundenen und getesteten Zustand eures Codes beschreibt.
Wenn ihr Änderungen durchführen wollt,
werdet ihr zunächst für euch herumprobieren,
diese Änderungen dann später
mit den anderen Mitgliedern eures Teams diskutieren,
und erst dann beschließen, ob ihr sie übernehmen wollt.

Zu diesem Zweck könnt ihr 
für jede größere Änderung oder Erweiterung,
die ihr entwickeln wollt,
einen neuen Branch anlegen.
Auf diesem könnt ihr dann gefahrlos herumexperimentieren,
beliebig Dateien verändern und eure Änderungen committen.
Wenn ihr fertig seid, könnt ihr diesen Branch
an das zentrale Repository übertragen (pushen),
wo ihn dann alle anderen sehen und prüfen können.
Wenn alle zufrieden sind,
könnt ihr gemeinsam beschließen,
die Änderungen von diesem Branch in euren Haupt-Branch
zu übernehmen.
Mit dem nächsten Pull werden diese Änderungen
dann an alle Mitglieder verteilt.

## Projektmanagement mit Git und GitHub

