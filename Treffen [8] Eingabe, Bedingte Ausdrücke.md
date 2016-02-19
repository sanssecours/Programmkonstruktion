# Wiederholungsfragen

- Welchen Datentyp haben die folgenden Ausdrücke?

```java
    1D        // Typ: double
    1F        // Typ: float
    '1'       // Typ: char
    "1"       // Typ: String
    1.0       // Typ: double
    1         // Typ: int
    1l        // Typ: long
    true      // Typ: boolean
    "true"    // Typ: String
    0b1       // Typ: int
    0x1L      // Typ: long
    (int) 1L  // Typ: int
```

- Macht die Entwicklung von Programmen ohne grafische Benutzeroberfläche heute noch Sinn? Kannst du Gründe dafür/dagegen nennen?

Ja: Automatisieren ist einfacher, Manchmal braucht man keine GUI (z.B. Webserver)

- Was gibt das folgende Programm aus

```java
public class Tmp {
    public static void main(String[] args) {
        // `\n` Zeichen für Newline — Geht in nächste Zeile
        System.out.println(args[1] + "\n" + args[3]);
    }
}
```

wenn wir es wie folgt aufrufen?

```bash
java Tmp Null Drei Zwei Fünf
```

Ausgabe:

```
Drei
Fünf
```

Was passiert wenn wir es mittels `java Tmp` aufrufen? Warum?

Programm stürzt ab (ergibt Exception) – Es kann nicht auf nicht vorhandene Elemente zugergriffen werden.

- Gib zu der jeweiligen Beschreibung den passenden Terminal-Befehl an.

```bash
# Zeige die Dateien im aktuellen Verzeichnis an
ls

# Kompiliere die Datei `Hello.java`
javac Hello.java

# Wechsle ins Verzeichnis `/hi/ho`
cd /hi/ho

# Führe die Datei `Hello.class` aus
java Hello
```

- Was ist ein Array?

Eine Liste von mehreren Elementen

- Java verwendet zur Speicherung von einzelnen Zeichen (`char`) 16 bit. Wie groß  ist der größte und kleinste Wert der mit diesem Datentyp dargestellt werden kann? Achtung: `char` speichert – im Gegensatz zu anderen Datentypen – nur positive Zahlen!

Kleinste Zahl: 0
Größte Zahl: 2^16-1

- Wie groß ist der Wertebereich (größte, kleinste Zahl) des Datentyps `int`?

Kleinste Zahl: -2^31
Größte Zahl: 2^31-1

# Eingabe

- Eine Möglichkeit der Eingabe haben wir schon gesehen (Argument nach Programmnamen angeben)
  - **Eingabe vor Programmausführung**
  - Dies ist auch die am häufigst eingesetzte Variante
  - Sehr mächtig, da sie es erlaubt Befehle zu kombinieren
  - Terminal-Befehle + (Abfragen, Schleifen, Funktionen) ergeben wieder eigene Programmiersprache (Shell-Programmierung)
  - Beispiel eines Shell-Programms:

```bash
  if [[ 2 < 3 ]]; then
    say "2 is smaller than 3"
    # Variable `PWD` beinhaltet aktuelles Verzeichnis
    # Zugriff auf eine Variable `var` mittels $var
    say "You are currently in the directory $PWD"
  fi
```

- Zweite Möglichkeit: **Interaktive Eingabe**
  - Programm liest **während Progamm-Ausführung**  Eingabe von Nutzer ein
  - Einlesen in Java zum Beispiel mittels Klasse `Scanner` möglich

## Beispiel-Programm

```java
// Importiere das Package Scanner
// Wird benötigt um Scanner-Klasse verwenden zu können
import java.util.Scanner;

public class Eingabe {
    public static void main(String[] args) {
        String eingabe;
        // Erstelle neues Objekt `scanner` vom Typ/Klasse `Scanner`
        // Verwende `System.in` („Tastatur“) zum Einlesen
        Scanner scanner = new Scanner(System.in);

        System.out.print("Eingabe (Abschluss mit ↩): ");
        // Speichere eine Zeile der Eingabe in der Variable `eingabe`
        eingabe = scanner.nextLine();
        System.out.println("Deine Eingabe war: " + eingabe);
    }
}
```

### Übung

1. Speichere das oben stehende Programm
2. Übersetze das Programm im Terminal
3. Führe das Programm aus
4. Wie muss man das Progamm umändern damit man statt einem String eine Ganzzahl (Typ: `int`) eingelesen und ausgegeben wird (**Tipp:** Java API von Scanner ansehen)?
5. Was passiert wenn man bei dem geänderten Programm statt einer Zahl etwas anderes wie z.B. `hiho` eingibt?
6. Ändere das Programm so, dass bei einer falschen Eingabe die Meldung `Keine Zahl!` am Bildschirm ausgegeben wird. // Machen wir später

# Bedingter Ausdruck

- Bedingter Ausdruck liefert je nach Wert von Bedingung unterschiedlichen Wert
- Bedingter Ausdruck hat sehr niedere Priorität (wird also erst sehr spät ausgewertet)

## Aufbau

```
boolscherAusdruck ? WertWennWahr : WertWennFalsch
```

## Beispiele

```java
2 < 3 ? true : false // Ergebnis: true
2 < 3 ? false : true // Ergebnis: true
false || true ? "Hi" : "Ho" // Ergebnis: "Hi"
```

## Übung

Wie lautet das Ergebnis der folgenden Ausdrücke

```java
1 == 2 ? 'a' : 'o'                    // Wert: 'o'
(2 * 3 < 7) ? 1 : (2 + 4)             // Wert: 1
2 * 3 < 7 ? 1 : 2 + 4                 // Wert: 1
1 != 1 ? (2 != 2 ? "Leo" : "nardo") :
         (5 != 6 ? "Di" : "Caprio")   // Wert: "Di"
```
