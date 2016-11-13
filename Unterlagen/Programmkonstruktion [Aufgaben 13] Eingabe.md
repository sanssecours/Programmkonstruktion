# Aufgaben

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

## Wiederholungsfragen

- Welchen Datentyp haben die folgenden Ausdrücke?

  ```java
      1D        // Typ:
      1F        // Typ:
      '1'       // Typ:
      "1"       // Typ:
      1.0       // Typ:
      1         // Typ:
      1l        // Typ:
      true      // Typ:
      "true"    // Typ:
      0b1       // Typ:
      0x1L      // Typ:
      (int) 1L  // Typ:
  ```

- Macht die Entwicklung von Programmen ohne grafische Benutzeroberfläche heute noch Sinn? Kannst du Gründe dafür/dagegen nennen?

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

- Was passiert wenn wir das vorhergehende Programm mittels `java Tmp` aufrufen? Warum?

- Gib zu der jeweiligen Beschreibung den passenden Terminal-Befehl an.

  ```bash
  # Zeige die Dateien im aktuellen Verzeichnis an

  # Kompiliere die Datei `Hello.java`

  # Wechsle ins Verzeichnis `/hi/ho`

  # Führe die Datei `Hello.class` aus

  ```

- Was ist ein Array?

- Java verwendet zur Speicherung von einzelnen Zeichen (`char`) 16 bit. Wie groß  ist der größte und kleinste Wert der mit diesem Datentyp dargestellt werden kann? Achtung: `char` speichert – im Gegensatz zu anderen Datentypen – nur positive Zahlen!

- Wie groß ist der Wertebereich (größte, kleinste Zahl) des Datentyps `int`?

[Lösungen](Programmkonstruktion [Lösungen 13] Eingabe.md)
