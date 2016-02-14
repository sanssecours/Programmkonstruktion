# Wiederholungsfragen

- Welche drei Eigenschaften einer Funktion muss man auf jeden Fall beim Kopf der Funktionsdefinition angeben?

-  Was ist der Unterschied zwischen primitiven Datentypen und (Objekt-)Datentypen in Java?

- Welche zwei Konstrukte gibt es, die den Programmfluss ändern können?

- Welchen Wert haben die folgenden Ausdrücke wenn man sie vereinfacht (d.h nur unter der Verwendung von Ziffern und Punkt schreibt)?

```java
  10e3     // Wert:
  5e-2d    // Wert:
  0x12     // Wert:
  0b1101   // Wert:
  -0x45    // Wert:
  00010D   // Wert:
  00010    // Wert:
```

# Terminal

- Früher hatten Computer keine grafische Benutzeroberfläche
- Programme wurden per Kommandozeile (Terminal) bedient
- Eingabe von **Befehlen** (Kommandos) rein mittels Keyboard (keine Maus, keine Touch-Bedienung)
- Heute ist das Terminal ein ganz normales Programm am Rechner
  - OS X: Terminal, iTerm
  - Windows: Kommandoeingabe
  - Linux: Gnome Terminal,  Konsole, …
- Benutzergruppe heutzutage:
  - Power-User
  - Entwickler
  - Hacker
  - System-Administratoren

## Allgemeiner Aufbau von Terminal-Befehlen

- Als erstes kommt der Name des Befehls
- Danach folgen mehrere Argumente/Parameter (es kann auch sein, dass ein Befehl keine Argument benötigt)
- Befehl und Parameter werden durch Leerzeichen getrennt
- Analogie: Aufbau ähnlich wie Aufruf von Java-Funktionen
  - Name der Funktion + Mehrere Parameter
  - Bei Java Funktionen werden – im Gegensatz zu Terminal-Befehlen – Beistriche zur Trennung der Parameter verwendet

```
nameDesBefehls argument1 argument2 argument3 …
```

## Beispiele

- Zum Ausführen einfach einzelne Zeile in `Terminal` einfügen und Return drücken
- Synonyme:
  - Folder = Verzeichnis = Directory = Ordner
  - Befehl = Kommando
- Abkürzungen:
  - pwd: **p**rint **w**orking **d**irectory
  - cd: **c**hange **d**irectory
  - ls: **l**i**s**t

```sh
say Hi # Computer gibt das Worte „Hi“ über Lautsprecher/Kopfhörer aus
pwd    # Zeigt an in welchem Verzeichnis man sich gerade befindet
ls     # Zeigt die Dateien im aktuellen Verzeichnis an
cd     # Wechselt ins „Home“-Verzeichnis
cd Pictures # Geht in das Verzeichnis `Pictures` im aktuellen Ordner
javac Test.java # Kompiliert die Java-Datei `Test.java`
                # Ergebnis (wenn es keine Fehler gibt): `Test.class`
java Test # Führt das Programm `Test.class` aus
```

## Übung

### Erste Schritte

1. Öffne das Programm „Terminal“
2. In welchem Verzeichnis befindest du dich?
3. Welche Dateien befinden sich im aktuellen Verzeichnis?
4. Wechsle ins Verzeichnis `Library`
5. Wie kannst du feststellen ob du dich wirklich im Verzeichnis `Library` befindest?
6. Welche Dateien befinden sich im Verzeichnis?

### Übersetzen von Java-Programmen

1. Erstelle eine neue Datei `Parameter.java` mit folgendem Inhalt:

    ```java
    public class Parameter {
        public static void main(String[] args) {

            for(int argCount = 0; argCount < args.length; argCount++) {
                System.out.println(argCount + ". Argument: " +  args[argCount]);
            }

        }
    }
    ```

2.  Speicher die Datei im Ordner deiner Wahl

3. Öffne die Applikation Terminal

4. Übersetze die Datei `Parameter.java` und führe sie dann aus (**Hinweis:** Um die Datei  auszuführen solltest du als erstes ins Verzeichnis, in dem du die Datei gespeichert hast, wechseln)

5. Welche Befehle hast du in Schritt 4 verwendet?

6. Was passiert wenn du folgende Befehl im Terminal eingibst?

    ```bash
    java Test Hi Ho Huhu
    java Hello World bla blubb
    java 'Hello World' bla blubb
    java "Hello World" bla blubb
    ```

7.  Was macht das Java-Programm?

8. Wozu können einfache oder doppelte Anführungszeichen bei Terminal-Befehlen verwendet werden?

# Einführung Arrays

-  Speichern mehre Werte vom gleichen Datentyp
- Array ist erkennbar an den eckigen Klammern nach dem Datentyp:
  - Beispiele:
    - `String[] args` (Liste von mehreren Strings)
    - `int[] numbers` (Liste von mehreren Ganzzahlen)
- Arrays haben bestimmte Länge
- Auf die Länge kann mittels der Methode `length` zugegriffen werden
- Auf einzelne Element kann mittels `name[stelle]` zugegriffen werden
  - Erstes Element: `name[0]`
  - Letztes Element: `name[name.length-1]`
- Irgendwann später noch Näheres dazu
  - Aktuelle Erklärung dient hauptsächlich dazu `Parameter.java` vollständig zu verstehen

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
6. Ändere das Programm so, dass bei einer falschen Eingabe die Meldung `Keine Zahl!` am Bildschirm ausgegeben wird.
