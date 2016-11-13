# Aufgaben

## Übung

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

1. Speichere das oben stehende Programm
2. Übersetze das Programm im Terminal

   - Befehl: `javac Eingabe.java`

3. Führe das Programm aus

   - Befehl: `java Eingabe`

4. Wie muss man das Progamm umändern damit man statt einem String eine Ganzzahl (Typ: `int`) eingelesen und ausgegeben wird (**Tipp:** Java API von Scanner ansehen)?

    ```java
    import java.util.Scanner;

    public class Eingabe {
        public static void main(String[] args) {
            int eingabe;
            Scanner scanner = new Scanner(System.in);

            System.out.print("Eingabe (Abschluss mit ↩): ");
            eingabe = scanner.nextInt();
            System.out.println("Deine Eingabe war: " + eingabe);
        }
    }
    ```

5. Was passiert wenn man bei dem geänderten Programm statt einer Zahl etwas anderes wie z.B. `hiho` eingibt?

    - Es tritt ein (Laufzeit-)Fehler auf, eine sogenannte **Exception** (`InputMismatchException`).

6. Ändere das Programm so, dass bei einer falschen Eingabe die Meldung `Keine Zahl!` am Bildschirm ausgegeben wird.


    ```java
    import java.util.Scanner;

    public class Eingabe {
        public static void main(String[] args) {
            int eingabe;
            Scanner scanner = new Scanner(System.in);

            System.out.print("Eingabe (Abschluss mit ↩): ");

            if (scanner.hasNextInt()) {
                eingabe = scanner.nextInt();
                System.out.println("Deine Eingabe war: " + eingabe);
            } else {
                System.out.println("Keine Zahl!");
            }
        }
    }
    ```

## Wiederholungsfragen

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

   - Ja: Automatisieren ist einfacher, Manchmal braucht man keine GUI (z.B. Webserver)

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

- Was passiert wenn wir das vorhergehende Programm mittels `java Tmp` aufrufen? Warum?

  - Das Programm stürzt ab (es kommt zu einer Exception). Grund: Es kann nicht auf nicht vorhandene Elemente zugegriffen werden.

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

    - Eine Liste von mehreren Elementen.

- Java verwendet zur Speicherung von einzelnen Zeichen (`char`) 16 bit. Wie groß  ist der größte und kleinste Wert der mit diesem Datentyp dargestellt werden kann? Achtung: `char` speichert – im Gegensatz zu anderen Datentypen – nur positive Zahlen!

  - Kleinste Zahl: 0
  - Größte Zahl: 2¹⁶-1

- Wie groß ist der Wertebereich (größte, kleinste Zahl) des Datentyps `int`?

  - Kleinste Zahl: -2³¹
  - Größte Zahl: 2³¹-1
